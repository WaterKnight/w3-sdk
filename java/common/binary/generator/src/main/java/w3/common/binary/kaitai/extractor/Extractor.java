package w3.common.binary.kaitai.extractor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.javapoet.*;
import io.kaitai.struct.KaitaiStruct;
import w3.common.core.Id;
import w3.common.core.app.War3String;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Extractor {
    private final File inputDir;
    private final File outputDir;

    private final String inputPackageName;
    private final String outputPackageName;

    private final String targetClassName;

    public Extractor(File inputDir, File outputDir, String inputPackageName, String outputPackageName, String targetClassName) {
        this.inputDir = inputDir;
        this.outputDir = outputDir;
        this.inputPackageName = inputPackageName;
        this.outputPackageName = outputPackageName;
        this.targetClassName = targetClassName;
    }

    public void extract() {
        try {
            doExec();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void doExec() throws IOException, ClassNotFoundException {
        final boolean ignored = outputDir.mkdirs();

        final URLClassLoader urlClassLoader = URLClassLoader.newInstance(new URL[]{inputDir.toURI().toURL()});

        final File inputDirWithPackage = inputDir.toPath().resolve(inputPackageName.replaceAll(Pattern.quote("."), "/")).toFile();

        for (final File file : Objects.requireNonNull(inputDirWithPackage.listFiles())) {
            final String clazzName = file.getName().split("[.]")[0];

            final Class<?> kaitaiClazz = urlClassLoader.loadClass(inputPackageName + "." + clazzName);

            if (kaitaiClazz.getEnclosingClass() != null) {
                continue;
            }

            final Field[] fields = kaitaiClazz.getDeclaredFields();

            final List<FieldSpec> fieldSpecs = Arrays.stream(fields)
                    .filter(field -> !field.getName().startsWith("_"))
                    .filter(field -> !field.getName().matches("^num[A-Z].*$"))
                    .map(field -> FieldSpec.builder(resolveType(TypeName.get(field.getGenericType())), makeFieldName(field), Modifier.PRIVATE)
                            .build()
                    ).collect(Collectors.toList());

            final List<MethodSpec> getterMethods = fieldSpecs.stream()
                    .map(fieldSpec -> MethodSpec.methodBuilder("get" + capitalize(fieldSpec.name))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(resolveType(fieldSpec.type))
                            .addStatement("return " + fieldSpec.name)
                            .build())
                    .collect(Collectors.toList());

            final List<MethodSpec> setterMethods = fieldSpecs.stream()
                    .map(fieldSpec -> MethodSpec.methodBuilder("set" + capitalize(fieldSpec.name))
                            .addModifiers(Modifier.PUBLIC)
                            .addParameter(ParameterSpec.builder(fieldSpec.type, "value").build())
                            .addStatement("this.$N = value", fieldSpec.name)
                            .build())
                    .collect(Collectors.toList());

            final Map<TypeSpec, Class<?>> nestedClassesMap = Arrays.stream(kaitaiClazz.getDeclaredClasses())
                    //.map(this::makeModelClazz)
                    .collect(Collectors.toMap(this::makeModelClazz, childKaitaiClazz -> childKaitaiClazz));

            final List<TypeSpec> nestedClasses = new ArrayList<>(nestedClassesMap.keySet());

            final MethodSpec constructorSpec = MethodSpec.constructorBuilder()
                    .build();

            TypeSpec.Builder newClazzSpecBuilder = TypeSpec.classBuilder(kaitaiClazz.getSimpleName())
                    .addModifiers(Modifier.PUBLIC);

            if ("W3str".equals(kaitaiClazz.getSimpleName())) {
                newClazzSpecBuilder.superclass(War3String.class);
                newClazzSpecBuilder.addMethod(
                        MethodSpec.constructorBuilder()
                                .addModifiers(Modifier.PUBLIC)
                                .addStatement("super()")
                                .build()
                );
                newClazzSpecBuilder.addMethod(
                        MethodSpec.constructorBuilder()
                                .addModifiers(Modifier.PUBLIC)
                                .addParameter(ParameterSpec.builder(String.class, "value")
                                        .build())
                                .addStatement("super(value)")
                                .addStatement("this.value = value")
                                .build()
                );
            }
            if ("W3id".equals(kaitaiClazz.getSimpleName())) {
                newClazzSpecBuilder.superclass(Id.class);
                newClazzSpecBuilder.addMethod(
                        MethodSpec.constructorBuilder()
                                .addModifiers(Modifier.PUBLIC)
                                .addStatement("super()")
                                .build()
                );
                newClazzSpecBuilder.addMethod(
                        MethodSpec.constructorBuilder()
                                .addModifiers(Modifier.PUBLIC)
                                .addParameter(ParameterSpec.builder(String.class, "value")
                                        .build())
                                .addStatement("super(value)")
                                .addStatement("this.value = value")
                                .build()
                );
            }

            newClazzSpecBuilder
                    .addFields(fieldSpecs)
                    .addMethods(getterMethods)
                    .addMethods(setterMethods)
                    .addTypes(nestedClasses);

            final TypeSpec newClazzSpec = newClazzSpecBuilder.build();

            final JavaFile javaFile = JavaFile.builder(outputPackageName, newClazzSpec).build();
            javaFile.writeTo(outputDir);

            final TypeSpec kaitaiToModelTypeSpec = makeKaitaiToModelMapperClazz(kaitaiClazz, outputPackageName, null, newClazzSpec, nestedClassesMap);

            final JavaFile kaitaiToModelJavaFile = JavaFile.builder(outputPackageName, kaitaiToModelTypeSpec).build();
            kaitaiToModelJavaFile.writeTo(outputDir);
        }
    }

    private TypeSpec makeModelClazz(Class<?> clazz) {
        if (clazz.isEnum()) {
            final TypeName resolvedClazzName = resolveType(ClassName.get(clazz));
            final TypeSpec.Builder enumSpec = TypeSpec.enumBuilder(clazz.getSimpleName())
                    .addModifiers(Modifier.PUBLIC);

            final var constants = clazz.getEnumConstants();

            for (final Object constant : constants) {
                //final int ordinal = i;
                //final int ordinal = ((Enum<?>) constant).ordinal();
                try {
                    final Long ordinal = ((Long) constant.getClass().getMethod("id").invoke(constant));
                    enumSpec.addEnumConstant(constant.toString(), TypeSpec.anonymousClassBuilder(String.format("%d", ordinal)).build());
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }

            enumSpec.addField(TypeName.LONG, "id", Modifier.PRIVATE, Modifier.FINAL);
            enumSpec.addMethod(MethodSpec.methodBuilder("id")
                    .addModifiers(Modifier.PUBLIC)
                    .returns(TypeName.LONG)
                    .addStatement("return id")
                    .build());

            enumSpec.addMethod(MethodSpec.constructorBuilder()
                    .addParameter(TypeName.LONG, "id")
                    .addStatement("this.id = id")
                    .build());

            enumSpec.addField(FieldSpec.builder(ParameterizedTypeName.get(ClassName.get(Map.class), ClassName.get(Long.class), resolvedClazzName), "byId")
                    .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                    .initializer(CodeBlock.builder()
                            .add("new $T<>()", HashMap.class)
                            .build())
                    .build());

            enumSpec.addStaticBlock(CodeBlock.builder()
                    .beginControlFlow("for ($T e : $T.values())", resolvedClazzName, resolvedClazzName)
                    .addStatement("byId.put(e.id(), e)")
                    .endControlFlow()
                    .build());

            enumSpec.addMethod(MethodSpec.methodBuilder("byId")
                    .addModifiers(Modifier.PUBLIC)
                    .returns(resolvedClazzName)
                    .addParameter(TypeName.LONG, "id")
                    .addStatement("return byId.get(id)")
                    .build());

            return enumSpec.build();
        }

        final Field[] fields = clazz.getDeclaredFields();

        final List<FieldSpec> fieldSpecs = Arrays.stream(fields)
                .filter(field -> !field.getName().startsWith("_"))
                .filter(field -> !field.getName().matches("^num[A-Z].*$"))
                .map(field -> FieldSpec.builder(resolveType(TypeName.get(field.getGenericType())), makeFieldName(field), Modifier.PRIVATE)
                        .build()
                ).collect(Collectors.toList());

        final List<MethodSpec> getterMethods = fieldSpecs.stream()
                .map(fieldSpec -> MethodSpec.methodBuilder("get" + capitalize(fieldSpec.name))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(resolveType(resolveType(fieldSpec.type)))
                        .addStatement("return " + fieldSpec.name)
                        .build())
                .collect(Collectors.toList());

        final List<MethodSpec> setterMethods = fieldSpecs.stream()
                .map(fieldSpec -> MethodSpec.methodBuilder("set" + capitalize(fieldSpec.name))
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(ParameterSpec.builder(resolveType(fieldSpec.type), "value").build())
                        .addStatement("this.$N = value", fieldSpec.name)
                        .build())
                .collect(Collectors.toList());

        final MethodSpec hashCodeMethod = MethodSpec.methodBuilder("hashCode")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PUBLIC)
                .returns(TypeName.INT)
                .addCode(CodeBlock.builder()
                        .addStatement(String.format("return $T.hash(%s)", getterMethods.stream().map(getterMethod -> String.format("%s()", getterMethod.name)).collect(Collectors.joining(", "))), Objects.class)
                        .build())
                .build();

        final CodeBlock.Builder equalsCodeBlockBuilder = CodeBlock.builder();

        equalsCodeBlockBuilder.beginControlFlow("if (!(that instanceof $N))", clazz.getSimpleName());
        equalsCodeBlockBuilder.addStatement("return false");
        equalsCodeBlockBuilder.endControlFlow();

        equalsCodeBlockBuilder.addStatement("final $N thatTyped = ($N) that", clazz.getSimpleName(), clazz.getSimpleName());

        getterMethods.forEach(getterMethod -> {
            equalsCodeBlockBuilder.beginControlFlow("if (!$T.equals($N(), thatTyped.$N()))", Objects.class, getterMethod.name, getterMethod.name);
            equalsCodeBlockBuilder.addStatement("return false");
            equalsCodeBlockBuilder.endControlFlow();
        });

        equalsCodeBlockBuilder.addStatement("return true");

        final MethodSpec equalsMethod = MethodSpec.methodBuilder("equals")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PUBLIC)
                .addParameter(ParameterSpec.builder(Object.class, "that").build())
                .returns(TypeName.BOOLEAN)
                .addCode(equalsCodeBlockBuilder.build())
                .build();

        final CodeBlock.Builder toStringCodeBlockBuilder = CodeBlock.builder()
                .addStatement("final StringBuilder stringBuilder = new StringBuilder()");

        toStringCodeBlockBuilder.addStatement("stringBuilder.append(\"{\")");

        final AtomicBoolean first = new AtomicBoolean(true);

        getterMethods.forEach(getterMethod -> {
            if (first.get()) {
                first.set(false);
            } else {
                toStringCodeBlockBuilder.addStatement("stringBuilder.append(\", \\n\")");
            }
            toStringCodeBlockBuilder.addStatement("stringBuilder.append(\"$N:\")", getterMethod.name);
            toStringCodeBlockBuilder.addStatement("stringBuilder.append($N())", getterMethod.name);
        });

        toStringCodeBlockBuilder.addStatement("stringBuilder.append(\"}\")");

        toStringCodeBlockBuilder.addStatement("return stringBuilder.toString()");

        final MethodSpec toStringMethod = MethodSpec.methodBuilder("toString")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PUBLIC)
                .returns(String.class)
                .addCode(toStringCodeBlockBuilder.build())
                .build();

        final List<TypeSpec> nestedClasses = Arrays.stream(clazz.getDeclaredClasses())
                .map(this::makeModelClazz)
                .collect(Collectors.toList());

        return TypeSpec.classBuilder(clazz.getSimpleName())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addFields(fieldSpecs)
                .addMethod(hashCodeMethod)
                .addMethod(equalsMethod)
                .addMethod(toStringMethod)
                .addMethods(getterMethods)
                .addMethods(setterMethods)
                .addTypes(nestedClasses)
                .build();
    }

    public static String capitalize(String str)
    {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private TypeName resolveType(TypeName value) {
        if (Objects.equals(value, ClassName.get(KaitaiStruct.class))) {
            return ClassName.OBJECT;
        }

        if (value instanceof ParameterizedTypeName) {
            ClassName rawType = ((ParameterizedTypeName) value).rawType;
            if (Objects.equals(rawType.canonicalName(), ArrayList.class.getCanonicalName())) {
                rawType = ClassName.get(List.class);
            }
            final List<TypeName> typeArgs = ((ParameterizedTypeName) value).typeArguments.stream().map(this::resolveType).collect(Collectors.toList());
            value = ParameterizedTypeName.get(rawType, typeArgs.toArray(TypeName[]::new));
        } else if (value instanceof ClassName) {
            if (((ClassName) value).packageName().equals(inputPackageName)) {
                if (((ClassName) value).enclosingClassName() != null) {
                    value = ClassName.get(outputPackageName, ((ClassName) value).enclosingClassName().simpleName(), ((ClassName) value).simpleName());
                } else {
                    value = ClassName.get(outputPackageName, ((ClassName) value).simpleName());
                }
            }
        }
        return value;
    }

    private String makeFieldName(Field field) {
        if (Collection.class.isAssignableFrom(field.getType())) {
            return field.getName();
        }
        return field.getName();
    }

    private TypeSpec makeKaitaiToModelMapperClazz(Class<?> kaitaiClazz, String outputPackageName, ClassName parentClassName, TypeSpec modelClazzSpec, Map<TypeSpec, Class<?>> nestedClassesMap) {
        final ClassName modelClazzName = parentClassName == null ? ClassName.get(outputPackageName, modelClazzSpec.name) : parentClassName.nestedClass(modelClazzSpec.name);
        //final ClassName modelClazzName = parentClassName == null ? ClassName.get(outputPackageName, targetClassName) : parentClassName.nestedClass(modelClazzSpec.name);
        final MethodSpec.Builder mapMethodBuilder = MethodSpec.methodBuilder("map")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addParameter(
                        ParameterSpec.builder(kaitaiClazz, "data")
                            .build()
                )
                .returns(modelClazzName);

        mapMethodBuilder.beginControlFlow("if (data == null)");
        mapMethodBuilder.addStatement("return null");
        mapMethodBuilder.endControlFlow();

        if (modelClazzSpec.kind == TypeSpec.Kind.ENUM) {
            mapMethodBuilder.addStatement("return $T.valueOf(data.name())", modelClazzName);
        } else if (Objects.equals(modelClazzName.simpleName(), "W3id")) {
            mapMethodBuilder.addStatement("return new $T(data.value())", modelClazzName);
        } else {
            mapMethodBuilder.addStatement("final $T newData = new $T()", modelClazzName, modelClazzName);

            modelClazzSpec.fieldSpecs.forEach(fieldSpec -> {
                //if (Objects.equals(fieldSpec.type, TypeName.get(Object.class))) {
                //    mapMethodBuilder.addStatement("newData.set$N(data.$N())", capitalize(fieldSpec.name), fieldSpec.name);
                //} else
                if (fieldSpec.type instanceof ParameterizedTypeName && Objects.equals(((ParameterizedTypeName) fieldSpec.type).rawType, TypeName.get(List.class))) {
                    final TypeName argumentName = ((ParameterizedTypeName) fieldSpec.type).typeArguments.get(0);
                    if (argumentName.isPrimitive() || argumentName.isBoxedPrimitive()) {
                        mapMethodBuilder.addStatement("newData.set$N(data.$N())", capitalize(fieldSpec.name), fieldSpec.name);
                    } else {
                        if (Objects.equals(fieldSpec.type, TypeName.get(String.class))) {
                            mapMethodBuilder.addStatement("newData.set$N(data.$N())", capitalize(fieldSpec.name), fieldSpec.name);
                        } else {
                            String simpleArgumentName = argumentName.toString();
                            if (argumentName instanceof ClassName) {
                                simpleArgumentName = ((ClassName) argumentName).simpleName();
                            }
                            mapMethodBuilder.addStatement("newData.set$N(data.$N().stream().map(kaitaiTo$NMapper::map).collect($T.toList()))", capitalize(fieldSpec.name), fieldSpec.name, simpleArgumentName, Collectors.class);
                        }
                    }
                } else {
                    if (fieldSpec.type.isPrimitive() || fieldSpec.type.isBoxedPrimitive() || fieldSpec.type instanceof ArrayTypeName) {
                        mapMethodBuilder.addStatement("newData.set$N(data.$N())", capitalize(fieldSpec.name), fieldSpec.name);
                    } else {
                        String simpleArgumentName = fieldSpec.type.toString();
                        if (fieldSpec.type instanceof ClassName) {
                            if (Objects.equals(fieldSpec.type, TypeName.get(String.class))) {
                                mapMethodBuilder.addStatement("newData.set$N(data.$N())", capitalize(fieldSpec.name), fieldSpec.name);
                            } else {
                                simpleArgumentName = ((ClassName) fieldSpec.type).simpleName();
                                if (Objects.equals(fieldSpec.type, ClassName.OBJECT)) {
                                    mapMethodBuilder.beginControlFlow("try");
                                    mapMethodBuilder.addStatement("newData.set$N(Class.forName(kaitaiTo$NMapper.class.getTypeName() + \"$$kaitaiTo\" + data.$N().getClass().getSimpleName() + \"Mapper\").getMethod(\"map\", data.$N().getClass()).invoke(null, data.$N()))", capitalize(fieldSpec.name), modelClazzName.topLevelClassName().simpleName(), fieldSpec.name, fieldSpec.name, fieldSpec.name);
                                    mapMethodBuilder.nextControlFlow("catch (Exception e)");
                                    mapMethodBuilder.addStatement("throw new AssertionError(e)");
                                    mapMethodBuilder.endControlFlow();
                                } else {
                                    mapMethodBuilder.addStatement("newData.set$N(kaitaiTo$NMapper.map(data.$N()))", capitalize(fieldSpec.name), simpleArgumentName, fieldSpec.name);
                                }
                            }
                        } else {
                            mapMethodBuilder.addStatement("newData.set$N(kaitaiTo$NMapper.map(data.$N()))", capitalize(fieldSpec.name), simpleArgumentName, fieldSpec.name);
                        }
                    }
                }
            });
            mapMethodBuilder.addStatement("return newData", modelClazzSpec, modelClazzSpec);
        }

        final MethodSpec mapMethod = mapMethodBuilder.build();

        final List<TypeSpec> childTypeSpecs = modelClazzSpec.typeSpecs.stream()
                .map(childTypeSpec -> makeKaitaiToModelMapperClazz(nestedClassesMap.get(childTypeSpec), outputPackageName, modelClazzName, childTypeSpec, nestedClassesMap))
                .collect(Collectors.toList());

        final TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder(String.format("kaitaiTo%sMapper", modelClazzSpec.name));

        typeSpecBuilder.addModifiers(Modifier.PUBLIC);

        if (parentClassName != null) {
            typeSpecBuilder.addModifiers(Modifier.STATIC);
        }

        typeSpecBuilder
                .addMethod(mapMethod)
                .addTypes(childTypeSpecs);

        return typeSpecBuilder.build();
    }
}
