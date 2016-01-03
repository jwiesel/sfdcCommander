@echo off
rem Prerequisite: register "{WIX-Toolset Folder}\bin\" in PATH variable

echo Cleaning up files from last package build.
del ..\..\..\target\sfdcCommanderSetup.msi

echo Building Windows installer package
candle.exe product.wxs -ext WiXUtilExtension
light.exe -ext WixUIExtension -ext WiXUtilExtension -cultures:en-us product.wixobj -out sfdcCommanderSetup.msi

move sfdcCommanderSetup.msi ..\..\..\target\

echo Cleaning up files after package build.
del product.wixobj
del sfdcCommanderSetup.wixpdb