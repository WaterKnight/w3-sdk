curl -o ./w3id.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3id.ksy
curl -o ./w3str.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3str.ksy
curl -o ./w3-obj-mod-file.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-obj-mod-file.ksy
curl -o ./w3-w3u.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3u.ksy
curl -o ./w3-w3t.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3t.ksy
curl -o ./w3-w3b.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3b.ksy
curl -o ./w3-w3d.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3d.ksy
curl -o ./w3-w3a.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3a.ksy
curl -o ./w3-w3h.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3h.ksy
curl -o ./w3-w3q.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3q.ksy
curl -o ./w3-w3o.ksy https://raw.githubusercontent.com/WaterKnight/Warcraft3-Formats-KaitaiStruct/main/w3-w3o.ksy

kaitai-struct-compiler^
    "./w3-w3o.ksy"^
    -t java -d ./generator/generated/kaitai/java^
    --java-package w3.object.collection.mod.w3o.model.kaitai