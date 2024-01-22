REM curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
REM curl -o ./w3-w3s.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3s.ksy

kaitai-struct-compiler^
    "./w3-w3s.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.env.placement.sound.w3s.model.kaitai