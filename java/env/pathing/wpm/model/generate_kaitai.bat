curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3-wpm.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-wpm.ksy

kaitai-struct-compiler^
    "./w3-wpm.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.env.pathing.wpm.model.kaitai