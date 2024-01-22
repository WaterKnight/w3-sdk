package w3.common.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.victools.jsonschema.generator.*;
import w3.common.core.Format;
import w3.common.core.Id;
import w3.common.core.app.War3String;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JsonSchemaGenerator {
    private final Class<?> modelClass;
    private final Class<? extends Format> encodingFormatClass;
    private final Class<?> serializedFormatClass;
    private final OutputStream outputStream;

    public JsonSchemaGenerator(Class<?> modelClass, Class<? extends Format> encodingFormatClass, Class<?> serializedFormatClass, OutputStream outputStream) {
        this.modelClass = modelClass;
        this.encodingFormatClass = encodingFormatClass;
        this.serializedFormatClass = serializedFormatClass;
        this.outputStream = outputStream;
    }

    public void generate() {
        final SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2020_12, OptionPreset.PLAIN_JSON);
        configBuilder
                .with(schemaGeneratorConfigBuilder -> {
                    schemaGeneratorConfigBuilder.forFields().withTargetTypeOverridesResolver(member -> {
                        if (member.getType().getErasedType() == Object.class) {
                            return Stream.of(Number.class, String.class).map(member.getContext()::resolve).collect(Collectors.toList());
                        }
                        return null;
                    });
                    schemaGeneratorConfigBuilder.forMethods().withTargetTypeOverridesResolver(member -> {
                        if (member.getType().getErasedType() == Object.class) {
                            return Stream.of(Number.class, String.class).map(member.getContext()::resolve).collect(Collectors.toList());
                        }
                        return null;
                    });
                })
                .forFields()
                .withTargetTypeOverridesResolver(fieldScope -> {
                    if (War3String.class.isAssignableFrom(fieldScope.getType().getErasedType())) {
                        return Collections.singletonList(fieldScope.getContext().resolve(String.class));
                    }
                    return null;
                })
                .withTargetTypeOverridesResolver(fieldScope -> {
                    if (Id.class.isAssignableFrom(fieldScope.getType().getErasedType())) {
                        return Collections.singletonList(fieldScope.getContext().resolve(String.class));
                    }
                    return null;
                })
                .withTargetTypeOverridesResolver(fieldScope -> {
                    if (encodingFormatClass.isAssignableFrom(fieldScope.getType().getErasedType())) {
                        return Collections.singletonList(fieldScope.getContext().resolve(serializedFormatClass));
                    }
                    return null;
                })
                .withIgnoreCheck(fieldScope -> fieldScope.getName().equals("version"))
                .withIgnoreCheck(fieldScope -> fieldScope.getName().equals("objs"))
                .withIgnoreCheck(fieldScope -> fieldScope.getName().matches("^num[A-Z].*$"));
        final SchemaGeneratorConfig config = configBuilder.build();
        final SchemaGenerator generator = new SchemaGenerator(config);
        final JsonNode jsonSchema = generator.generateSchema(modelClass);
        final String jsonSchemaString = jsonSchema.toPrettyString();
        try (final PrintStream outputStream = new PrintStream(this.outputStream)) {
            outputStream.printf(jsonSchemaString);
        }
    }
}
