curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3char.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3char.ksy
curl -o ./w3-w3v.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3v.ksy

kaitai-struct-compiler^
    "./w3-w3v.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.save.w3v.impl.kaitai