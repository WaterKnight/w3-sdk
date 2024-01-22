curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3-doo.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-doo.ksy
curl -o ./w3-doo-1-32.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-doo-1-32.ksy
curl -o ./w3-doo-pre-1-32.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-doo-pre-1-32.ksy

kaitai-struct-compiler^
    "./w3-doo-1-32.ksy"^
    "./w3-doo-pre-1-32.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.env.placement.object.doo.model.kaitai