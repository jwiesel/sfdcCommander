#!/bin/bash
CFG="../../../config"
TARGET="../../../target"
PACKAGE="${TARGET}/debian-package"
echo Cleaning up build-folder
rm -rf ${PACKAGE}
rm -f ${TARGET}/sfdcCommander_0.5.deb
echo Creating new build-folder and package structure
cp -r debian-package/ ${TARGET}
sudo chown root:root ${PACKAGE}/DEBIAN/*
mkdir -p ${PACKAGE}/usr/share/sfdcCommander/config
mkdir -p ${PACKAGE}/etc/sfdcCommander
cp ${TARGET}/sfdcCommander-0.0.1-SNAPSHOT.jar ${PACKAGE}/usr/share/sfdcCommander/sfdcCommander.jar
cp ${CFG}/SampleOrg.properties ${PACKAGE}/etc/sfdcCommander
cp -r ${CFG}/transformer ${PACKAGE}/usr/share/sfdcCommander/config
echo Generating md5sums
cd ${PACKAGE}
find . -type f ! -regex '.*.hg.*' ! -regex '.*?debian-binary.*' ! -regex '.*?DEBIAN.*' -printf '%P ' | xargs md5sum > DEBIAN/md5sums
chmod g-w DEBIAN/md5sums
echo Compiling .deb package
cd ..
fakeroot dpkg -b debian-package sfdcCommander_0.5.deb