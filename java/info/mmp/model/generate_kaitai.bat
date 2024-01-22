REM curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3-mmp.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-mmp.ksy

kaitai-struct-compiler^
    "./w3-mmp.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.info.mmp.model.kaitai