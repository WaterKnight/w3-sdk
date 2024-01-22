package w3.common.order.model.generator;

import com.squareup.javapoet.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (final Workbook workbook = new XSSFWorkbook("java/common/order/model/generator/Warcraft 3 Order Ids.xlsx")) {
            final Sheet sheet = workbook.getSheetAt(0);
            final Map<String, Integer> columnNameToIndex = new HashMap<>();
            sheet.getRow(0).cellIterator().forEachRemaining(cell -> {
                final String value = cell.getStringCellValue();
                columnNameToIndex.put(value, cell.getColumnIndex());
            });

            final int decimalColumnIndex = columnNameToIndex.get("dec index");
            final int shortDescriptionColumnIndex = columnNameToIndex.get("short description");

            final var rowIterator = sheet.rowIterator();
            rowIterator.next();
            final List<OrderSpec> orderSpecs = new ArrayList<>();
            rowIterator.forEachRemaining(row -> {
                final Cell decimalIndexCell = row.getCell(decimalColumnIndex);
                final Cell shortDescriptionCell = row.getCell(shortDescriptionColumnIndex);
                final Integer decimalIndex = Optional.ofNullable(decimalIndexCell).map(Cell::getNumericCellValue).map(Double::intValue).orElse(null);
                if (decimalIndex != null) {
                    final String shortDescription = Optional.ofNullable(shortDescriptionCell).map(Cell::getStringCellValue).orElse(null);
                    orderSpecs.add(new OrderSpec(decimalIndex, shortDescription));
                }
            });
            final TypeSpec.Builder enumBuilder = TypeSpec.enumBuilder("OrderEnum")
                    .addModifiers(Modifier.PUBLIC);
            orderSpecs.forEach(orderSpec -> {
                final String name = Optional.ofNullable(orderSpec.shortDescription)
                        .map(s -> s.replaceAll("\\?", ""))
                        .map(s -> s.replaceAll("/", ""))
                        .map(s -> s.replaceAll("'", ""))
                        .map(s -> s.replaceAll(",", ""))
                        .map(s -> s.replaceAll(".", ""))
                        .map(s -> s.equals("") ? null : s)
                        .map(s -> s.replaceAll("\\(", "_"))
                        .map(s -> s.replaceAll("\\)", "_"))
                        .map(s -> s.replaceAll("\\s", "_"))
                        .map(s -> s.replaceAll("_+", "_"))
                        .map(s -> s.toUpperCase(Locale.US))
                        .orElse("ORDER_" + orderSpec.index);
                enumBuilder.addEnumConstant(name,
                        TypeSpec.anonymousClassBuilder("$N, $N", Integer.toString(orderSpec.index), orderSpec.shortDescription == null ? "null" : "\"" + orderSpec.shortDescription + "\"")
                        .build()
                );
            });
            enumBuilder.addField(FieldSpec.builder(TypeName.INT, "id").addModifiers(Modifier.PRIVATE, Modifier.FINAL).build());
            enumBuilder.addField(FieldSpec.builder(TypeName.get(String.class), "shortDescription").addModifiers(Modifier.PRIVATE, Modifier.FINAL).build());
            enumBuilder.addMethod(MethodSpec.methodBuilder("getId").addModifiers(Modifier.PUBLIC).returns(TypeName.INT).addStatement("return this.id").build());
            enumBuilder.addMethod(MethodSpec.methodBuilder("getShortDescription").addModifiers(Modifier.PUBLIC).returns(String.class).addStatement("return this.shortDescription").build());
            enumBuilder.addMethod(
                    MethodSpec.constructorBuilder()
                            .addParameter(ParameterSpec.builder(TypeName.INT, "id").build())
                            .addParameter(ParameterSpec.builder(TypeName.get(String.class), "shortDescription").build())
                            .addStatement("this.id = id")
                            .addStatement("this.shortDescription = shortDescription")
                    .build()
            );
            final JavaFile javaFile = JavaFile.builder("w3.common.order.model", enumBuilder.build()).build();
            javaFile.writeTo(new File("java/common/order/model/generated/java"));
        }
    }

    private static class OrderSpec {
        private final int index;
        private final String shortDescription;

        private OrderSpec(int index, String shortDescription) {
            this.index = index;
            this.shortDescription = shortDescription;
        }
    }
}
