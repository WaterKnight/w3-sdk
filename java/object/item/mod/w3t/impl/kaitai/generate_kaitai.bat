curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3char.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3char.ksy
REM curl -o ./w3-w3t.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3t.ksy

kaitai-struct-compiler^
    "./w3-w3t.ksy"^
    -t java -d ./generated/kaitai/java^
    --java-package w3.object.item.mod.w3t.impl.kaitai