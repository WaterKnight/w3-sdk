curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3-wct.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-wct.ksy

kaitai-struct-compiler^
    "./w3-wct.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.script.gui.wct.model.kaitai