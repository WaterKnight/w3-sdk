pushd "../../../../.."
cd java/common/slk/generator
set input-file=%~dp0../CliffMeta.slk
set output-dir=%~dp0generated\slkgen\java
set output-package-name=w3.env.terrain.cliff_types.impl
set output-class-name=CliffTypeState
call generate_slk2java.bat -if "%input-file%" -od "%output-dir%" -opkg "%output-package-name%" -oclz "%output-class-name%"
popd