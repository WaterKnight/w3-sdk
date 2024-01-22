curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3-shd.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-shd.ksy

kaitai-struct-compiler^
    "./w3-shd.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.env.shadow.shd.model.kaitai