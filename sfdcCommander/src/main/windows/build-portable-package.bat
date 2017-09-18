@echo off
rem Prerequisite: register 7Zip folder in PATH variable

set CFG=..\..\..\config
set TARGET=..\..\..\target
set PACKAGE=%TARGET%\portable-package

echo Cleaning up files from last package build.
rmdir /S /Q %PACKAGE%
del %TARGET%\sfdcCommander-0.5-Portable.zip

echo Preparing package structure
mkdir %PACKAGE%
mkdir %PACKAGE%\config
copy %TARGET%\sfdcCommander-0.0.1-SNAPSHOT.jar %PACKAGE%\sfdcCommander.jar
copy %CFG%\SampleOrg.properties %PACKAGE%\config\
xcopy /S %CFG%\transformer\* %PACKAGE%\config\transformer\

echo Compressing package
7z a %TARGET%\sfdcCommander-0.5-Portable.zip %PACKAGE%\*
