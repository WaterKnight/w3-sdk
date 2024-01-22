curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
REM curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3-w3e.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3e.ksy

kaitai-struct-compiler^
    "./w3-w3e.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.env.placement.terrain.w3e.model.kaitai