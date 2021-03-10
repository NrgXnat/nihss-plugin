# XNAT NIH Stroke Scale Plugin #

This is the XNAT 1.8 NIH Stroke Scale Subject Assessor Plugin.

# Building #

To build the plugin:

1. If you haven't already, clone [this repository](https://bitbucket.org/xnatx/xnatx-nihss-plugin.git) and cd to the newly cloned folder.

1. Build the plugin:

    `./gradlew clean jar` 
    
    On Windows, you can use the batch file:
    
    `gradlew.bat clean jar`
    
    This should build the plugin in the file **build/libs/xnatx-nihss-plugin-1.1.0.jar** 
    (the version may differ based on updates to the code).
    

# Deploying #

1. Copy the plugin jar to your plugins folder: 

    `cp build/libs/xnatx-nihss-plugin-1.1.0.jar /data/xnat/home/plugins`


The location of the **plugins** folder varies based on how and where you have installed your XNAT. If you are running 
a virtual machine created through the [XNAT Vagrant project](https://bitbucket/xnatdev/xnat-vagrant.git),
you can copy the plugin to the appropriate configuration folder and then copy it within the VM from 
**/vagrant** to **/data/xnat/home/plugins**.


Once you've completed these steps, restart the Tomcat server. Your new plugin will be available as soon 
as the restart and initialization process is completed.

