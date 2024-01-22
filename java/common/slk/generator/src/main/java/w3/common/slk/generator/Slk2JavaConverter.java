package w3.common.slk.generator;

import com.squareup.javapoet.*;
import w3.common.core.*;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3Real;
import w3.common.core.app.War3String;
import w3.common.slk.api.SlkFileParser;
import w3.common.slk.impl.AntlrBasedSlkFileParser;
import w3.common.slk.model.SlkFile;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Slk2JavaConverter {
    private final byte[] bytes;
    private final File outputDirectory;
    private final String packageName;
    private final String className;
    private final String modelClassName;

    public Slk2JavaConverter(byte[] bytes, File outputDirectory, String packageName, String className, String modelClassName) {
        this.bytes = bytes;
        this.outputDirectory = outputDirectory;
        this.packageName = packageName;
        this.className = className;
        this.modelClassName = modelClassName;
    }

    public void convert() {
        try {
            write();
            writeModel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void write() throws IOException {
        final SlkFileParser stdSlkFileParser = new AntlrBasedSlkFileParser(new SlkFile(), bytes);
        final SlkFile slkFile = stdSlkFileParser.parse();
        final List<FieldSpec> fieldSpecs = new ArrayList<>();
        slkFile.getRows().forEach((rowId, row) -> {
            TypeName rowDataType = ClassName.get(DataType.class);
            DataTypeInfo rowDataTypeInfo = null;
            final String rowDataTypeRaw = row.getString(FieldId.valueOf("type"));
            final String defaultValueRaw = Optional.ofNullable(row.get(FieldId.valueOf("defautlValue"))).map(Object::toString).orElse(null);
            Object defaultValue = null;
            switch (rowDataTypeRaw) {
                case "int": {
                    rowDataType = ClassName.get(War3Int.class);
                    defaultValue = String.format("War3Int.valueOf(%s)", defaultValueRaw);
                    break;
                }
                case "real": {
                    rowDataType = ClassName.get(War3Real.class);
                    defaultValue = String.format("War3Real.valueOf(%s)", defaultValueRaw);
                    break;
                }
                case "string": {
                    rowDataType = ClassName.get(War3String.class);
                    defaultValue = String.format("War3String.valueOf(%s)", Optional.ofNullable(defaultValueRaw).map(s -> "\"" + s + "\"").orElse(null));
                    break;
                }
                case "stringList": {
                    rowDataType = ParameterizedTypeName.get(ClassName.get(DataList.class), ClassName.get(War3String.class));
                    rowDataTypeInfo = new DataTypeInfo(DataList.class, War3String.class);
                    break;
                }
            }

            CodeBlock codeBlock = CodeBlock.builder()
                    .add("new $T<>($T.valueOf($S), $T.class, $L)", FieldState.class, Id.class, rowId, rowDataType, defaultValue)
                    .build();

            if (rowDataTypeInfo != null) {
                codeBlock = CodeBlock.builder()
                        .add("new $T<>($T.valueOf($S), new $T($T.class, $T.class), $L)", FieldState.class, Id.class, rowId, rowDataTypeInfo.getClass(), rowDataTypeInfo.getType(), Arrays.stream(rowDataTypeInfo.getGenerics()).map(s -> s.getType()).findFirst().get(), defaultValue)
                        .build();
            }

            final FieldSpec fieldSpec = FieldSpec.builder(ParameterizedTypeName.get(ClassName.get(FieldState.class), rowDataType), row.get(FieldId.valueOf("field")).toString().toUpperCase(Locale.US))
                    .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                    .initializer(codeBlock)
                    .build();
            fieldSpecs.add(fieldSpec);
        });
        final TypeSpec clazzSpec = TypeSpec.classBuilder(className)
                .addModifiers(Modifier.PUBLIC)
                .addFields(fieldSpecs)
                .build();
        final JavaFile javaFile = JavaFile.builder(packageName, clazzSpec)
                .build();
        javaFile.writeTo(outputDirectory);
    }

    private void writeModel() throws IOException {
        final SlkFileParser stdSlkFileParser = new AntlrBasedSlkFileParser(new SlkFile(), bytes);
        final SlkFile slkFile = stdSlkFileParser.parse();
        final List<FieldSpec> fieldSpecs = new ArrayList<>();
        slkFile.getRows().forEach((rowId, row) -> {
            TypeName rowDataType = ClassName.get(DataType.class);
            DataTypeInfo rowDataTypeInfo = null;
            final String rowDataTypeRaw = row.getString(FieldId.valueOf("type"));
            final String defaultValueRaw = Optional.ofNullable(row.get(FieldId.valueOf("defaultValue"))).map(Object::toString).orElse(null);
            Object defaultValue = null;
            switch (rowDataTypeRaw) {
                case "int": {
                    rowDataType = ClassName.get(War3Int.class);
                    if (defaultValueRaw != null) {
                        defaultValue = String.format("War3Int.valueOf(%s)", defaultValueRaw);
                    }
                    break;
                }
                case "real": {
                    rowDataType = ClassName.get(War3Real.class);
                    if (defaultValueRaw != null) {
                        defaultValue = String.format("War3Real.valueOf(%s)", defaultValueRaw);
                    }
                    break;
                }
                case "string": {
                    rowDataType = ClassName.get(War3String.class);
                    if (defaultValueRaw != null) {
                        defaultValue = String.format("War3String.valueOf(%s)", Optional.ofNullable(defaultValueRaw).map(s -> "\"" + s + "\"").orElse(null));
                    }
                    break;
                }
                case "stringList": {
                    rowDataType = ParameterizedTypeName.get(ClassName.get(DataList.class), ClassName.get(War3String.class));
                    rowDataTypeInfo = new DataTypeInfo(DataList.class, War3String.class);
                    break;
                }
                case "tilecode": {
                    rowDataType = ClassName.get(Id.class);
                    if (defaultValueRaw != null) {
                        defaultValue = String.format("Id.valueOf(%s)", Optional.ofNullable(defaultValueRaw).map(s -> "\"" + s + "\"").orElse(null));
                    }
                    break;
                }
                case "tilelist": {
                    rowDataType = ParameterizedTypeName.get(ClassName.get(List.class), ClassName.get(Id.class));
                    defaultValue = String.format("java.util.Arrays.asList(%s)", Optional.ofNullable(defaultValueRaw).map(s -> s.trim().isEmpty() ? null : s).map(s -> Arrays.stream(s.split(",")).map(s2 -> "\"" + s2 + "\"").collect(Collectors.joining(", "))).orElse(""));
                    break;
                }
            }

            CodeBlock codeBlock = CodeBlock.builder()
                    .add("$L", defaultValue)
                    .build();

            if (rowDataTypeInfo != null) {
                codeBlock = CodeBlock.builder()
                        .add("$L", defaultValue)
                        .build();
            }

            final FieldSpec fieldSpec = FieldSpec.builder(rowDataType, row.get(FieldId.valueOf("field")).toString())
                    .addModifiers(Modifier.PUBLIC)
                    .initializer(codeBlock)
                    .build();
            fieldSpecs.add(fieldSpec);
        });
        final TypeSpec objectClazzSpec = TypeSpec.classBuilder("Object")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addFields(fieldSpecs)
                .build();
        final FieldSpec objectsFieldSpec = FieldSpec.builder(ParameterizedTypeName.get(ClassName.get(List.class), ClassName.get("", "Object")), "objects")
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .initializer(
                        CodeBlock.builder()
                                .add("new $T<>()", ArrayList.class)
                                .build()
                )
                .build();
        final MethodSpec getObjectsMethodSpec = MethodSpec.methodBuilder("getObjects")
                .addModifiers(Modifier.PUBLIC)
                .returns(ParameterizedTypeName.get(ClassName.get(List.class), ClassName.get("", "Object")))
                .addCode(
                        CodeBlock.builder()
                                .addStatement("return objects")
                                .build()
                )
                .build();
        final TypeSpec clazzSpec = TypeSpec.classBuilder(modelClassName)
                .addModifiers(Modifier.PUBLIC)
                .addField(objectsFieldSpec)
                .addMethod(getObjectsMethodSpec)
                .addType(objectClazzSpec)
                .build();
        final JavaFile javaFile = JavaFile.builder(packageName, clazzSpec)
                .build();
        javaFile.writeTo(outputDirectory);
    }
}
