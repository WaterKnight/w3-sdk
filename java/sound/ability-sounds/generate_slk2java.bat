pushd "../../.."
cd java/common/slk/generator
call generate_slk2java.bat -if "%~dp0AbilitySoundsMeta.slk" -od "%~dp0generated\slkgen\java" -opkg "w3.sound" -oclz "AbilitySoundsState"
REM start "" /wait /b "generate_slk2java.bat" "%~dp0/AbilitySoundsMeta.slk"
popd