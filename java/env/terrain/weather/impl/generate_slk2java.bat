pushd "../../../../.."
cd java/common/slk/generator
set input-file=%~dp0../WeatherMeta.slk
set output-dir=%~dp0generated\slkgen\java
set output-package-name=w3.env.terrain.weather.impl
set output-class-name=WeatherTypeState
call generate_slk2java.bat -if "%input-file%" -od "%output-dir%" -opkg "%output-package-name%" -oclz "%output-class-name%"
popd