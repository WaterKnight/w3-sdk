curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3-wtg-131.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-wtg-131.ksy
curl -o ./w3-wtg-pre131.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-wtg-pre131.ksy

kaitai-struct-compiler^
    "./w3-wtg-131.ksy"^
    "./w3-wtg-pre131.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.script.gui.wtg.model.kaitai