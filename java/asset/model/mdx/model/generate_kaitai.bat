curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
REM curl -o ./w3-mdx.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-mdx.ksy

kaitai-struct-compiler^
    "./w3-mdx.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.asset.model.mdx.model.kaitai