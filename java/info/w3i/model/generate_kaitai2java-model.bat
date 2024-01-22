pushd "../../../.."
cd java/common/binary/generator
set input-dir=%~dp0generator\target\classes
set output-dir=%~dp0generated\java
set input-package-name=w3.info.w3i.model.kaitai
set output-package-name=w3.info.w3i.model
call generate_kaitai2java-model.bat -i "%input-dir%" -o "%output-dir%" -ipkg "%input-package-name%" -opkg "%output-package-name%"
popd