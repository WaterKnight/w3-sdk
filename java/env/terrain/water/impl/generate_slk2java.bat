pushd "../../../../.."
cd java/common/slk/generator
set input-file=%~dp0../WaterMeta.slk
set output-dir=%~dp0generated\slkgen\java
set output-package-name=w3.env.terrain.water.impl
set output-class-name=WaterTypeState
call generate_slk2java.bat -if "%input-file%" -od "%output-dir%" -opkg "%output-package-name%" -oclz "%output-class-name%"
popd