REM curl -o ./w3-w3g.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3g.ksy

kaitai-struct-compiler^
    "./w3-w3g.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.replay.w3g.impl.kaitai