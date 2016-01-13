sfdcCommander is a metadata management tool for salesforce.com. It offers you helpful features to understand and improve your metadata configuration. Furthermore you can save a lot of time in the administration of your salesforce.com Organizations

## Features
### [salesforce.com Tech-Docu Generator](salesforce.com-tech-docu-generator)
![salesforce.com Documentation Generator](http://static.force-box.com/img/documentation-generator.png)

The Tech-Docu Generator creates a complete system documentation for your salesforce-Orgs with only one click! This is especially helpful, if you need an easy to access and always up-to-date documentation for your salesforce-Orgs. The documentation contains most of the salesforce entities like Objects, Page-Layouts, Profiles, Permission-Sets, etc. Furthermore the documentation is very user-friendly and responsive. You can view it on tablets and smartphones, if you like. Page-Layouts are displayed in the documentation like they are shown in salesforce.com when you view them.
### [salesforce.com Database-Backup](salesforce.com database backup)
![salesforce.com Database Backup](http://static.force-box.com/img/database-backup.png)

Need an easy to analyze and complete backup of you salesforce-Org? Why not create a database-snapshot into a local database? The Database-Backup generates a complete copy of your Org into Sqlite. Therefore you can review the entire data, analyze it using SQL, etc.
### salesforce.com Schema-Export
![salesforce.com Schema-Export](http://static.force-box.com/img/schema-export.png)

The Schema-Export offers you the ability to generate a complete Object-Schema into a Microsoft Excel-Sheet for every object at the same time. You can easily store the complete structure of your data model with only one click. This is especially helpful if separate files are needed in your documentation. E.g. if you want to share the schema of only one special object or if you want to process the data model in a certain way. 
### salesforce.com Metadata-Downloader
![Automatic salesforce.com Metadata Download](http://static.force-box.com/img/metadata-download.png)

The Metadata-Downloader does a complete download of your Org-Metadata to your local hard-drive. The nice thing about this functionality in sfdcCommander is: You neither need a build.xml nor a package.xml. sfdcCommander automatically downloads all members of all entities in your org. --> complete metadata.
## Drafted Features
When started implementing sfdcCommander there were a lot of different ideas flying around to to ease the day of a salesforce-administrator. The following features were only started but not completed. Interested Java-developers might use the inspiration to complete the following features.
### Metadata-Comparison
![salesforce.com Org-Compare](http://static.force-box.com/img/compare-orgs.png)

Idea: Ensure an identical Org-Setup after a deployment from one salesforce-Org to another or just for two different salesforce-Orgs. The metadata-comparison helps to find out, which things are differently setup in different salesforce-Orgs by downloading the metadata of both orgs and comparing the XML automatically.
### Version Control for salesforce.com
![salesforce.com Version Control](http://static.force-box.com/img/version-control.png)

Idea: Download the metadata of a salesforce-Org and put it under version-control in Subversion. This gives you the possibility to review changes made since the last commit to a subversion repository (e.g. since the last release, month or day)
## Good to know
In the first instance this tool has been developed to avoid writing technical documentations and to be able to analyze salesforce.com data using SQL. Since then it evolved to a stable application helping you save time with things which can normally steal a lot of time (e.g. finding all implicit members in a package.xml). sfdcCommander is a client application which can be used manually or via scheduled jobs. If you are looking for an online-service which does this job for you, check out [forcebox](https://force-box.com/). It offers similar features plus many more to optimize your salesforce.com release management process. Furthermore forcebox follows a more-generic approach of salesforce.com metadata-analysis (e.g. instead of XSLT for the documentation). sfdcCommander itself can be helpful and if you are a technical person working with salesforce.com. Furthermore it is a very good starting point for the implementation of further ideas to master your metadata.

### How to install sfdcCommander?
sfdcCommander is offered in three different versions in the [download-area](https://github.com/jwiesel/sfdcCommander/releases).
* Windows Installer (.msi)
* Debian Installer (.deb)
* Portable (.zip)

The two installers offer a nice installation, deinstallation and upgrade dialog as you are used to from other client applications. Furthermore, you neither need to copy or replace files nor application launcher shortcuts. On the other hand the portable version is operating system independant and can easily be carried (e.g. on a usb-stick).

### How to configure & start sfdcCommander?
sfdcCommander offers two different user interfaces. A graphical user interface (GUI) and a command line interface (CLI). The GUI is optimized to work on Windows and Linux based operating systems.
* sfdcCommander uses one configuration file per salesforce.com-Org.
* Simply enter your data (Org-Name, credentials, output-folders) like shown in [config/SampleOrg.properties](https://github.com/jwiesel/sfdcCommander/blob/master/sfdcCommander/config/SampleOrg.properties)
* You can afterwards start any command by typing in the following

```Batchfile
java -jar sfdcCommander.jar --<command> -c config/SampleOrg.properties
```
* Example for Tech-Docu generation

```Batchfile
java -jar sfdcCommander.jar --render -c config/SampleOrg.properties
```
* Or you can easily select the required action in the GUI.
![sfdcCommander Graphical User Interface](http://static.force-box.com/img/sfdcCommander-userinterface.png)

Goodie: If you installed sfdcCommander via the installer packages, you don't need to look for the sfdcCommander.jar, but can easily launch it as any other application via the "Start-Menu" on of your operating system.

### Build Process
This project uses Travis-CI for it's builds.
Current build status: [![Build Status](https://travis-ci.org/jwiesel/sfdcCommander.svg?branch=master)](https://travis-ci.org/jwiesel/sfdcCommander)

### Development Environment
* Windows 7 64bit / Ubuntu 15.10 64bit
* JDK 7 & JDK 8
* Eclipse-IDE
* Maven Dependency Management
* Git & Github (of course :-) )
* Windows Installer Xml Compiler (if you want to generate a Windows-installer next to the portable version)
* Various open-source libraries managed by Maven
* Travis-CI for automated builds

## What else?
We are very curious for any kind of feedback! Either send an email via the contact form on [forcebox](https://force-box.com/) or just create new issues here in Github. We will be happy to have a look and to implement them, if possible. :-)
