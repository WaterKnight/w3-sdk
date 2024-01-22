pushd "../../../../.."
cd java/common/slk/generator
set input-file=%~dp0../TerrainMeta.slk
set output-dir=%~dp0generated\slkgen\java
set output-package-name=w3.env.terrain.terrain.gen
set output-class-name=W3TerrainState
set output-model-class-name=W3Terrain
call generate_slk2java.bat -if "%input-file%" -od "%output-dir%" -opkg "%output-package-name%" -oclz "%output-class-name%" -omclz "%output-model-class-name%"
popd