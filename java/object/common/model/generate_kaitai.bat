curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3char.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3char.ksy
REM curl -o ./w3-obj-mod-file.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-obj-mod-file.ksy

kaitai-struct-compiler^
    "./w3-obj-mod-file.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.object.common.impl.kaitai