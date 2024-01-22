curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3-w3n.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3n.ksy

kaitai-struct-compiler^
    "./w3-w3n.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.campaign.w3n.model.kaitai