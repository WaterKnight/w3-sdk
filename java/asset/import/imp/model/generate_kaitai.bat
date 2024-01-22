curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3-imp.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-imp.ksy

kaitai-struct-compiler^
    "./w3-imp.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.asset.imports.imp.model.kaitai