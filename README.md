# XNAT NIH Stroke Scale Plugin #

This is the XNAT 1.7 NIH Stroke Scale Plugin.

# Building #

To build the plugin:

1. If you haven't already, clone [this repository](https://bitbucket.org/xnatx/xnatx-nihss-plugin.git) and cd to the newly cloned folder.

1. Build the plugin:

    `./gradlew clean jar distZip` 
    
    On Windows, you can use the batch file:
    
    `gradlew.bat clean jar distZip`
    
    This should build the plugin in the file **build/libs/xnatx-nihss-plugin-1.0.0.jar** 
    (the version may differ based on updates to the code).
    
1. Copy the plugin jar to your plugins folder: 

    `cp build/libs/xnatx-nihss-plugin-1.0.0.jar /data/xnat/home/plugins`

# Deploying #

## Plugin ##

Deploying your XNAT plugin requires the following steps:

1. Copy the plugin jar to the **plugins** folder for your XNAT installation. The location of the 
**plugins** folder varies based on how and where you have installed your XNAT. If you are running 
a virtual machine created through the [XNAT Vagrant project](https://bitbucket/xnatdev/xnat-vagrant.git),
you can copy the plugin to the appropriate configuration folder and then copy it within the VM from 
**/vagrant** to **/data/xnat/home/plugins**.

1. As of this writing, you also need to use a special branch of XNAT named **json-properties**. This 
   mainly adds an extra library to support JSON as an SQL data type in PostgreSQL that can be be easily
   used with Hibernate.

1. You also need to change the PostgreSQL dialect for your server configuration. This is ordinarily set to something like this:

    ```
    hibernate.dialect=org.hibernate.dialect.PostgreSQL9Dialect
    ```
    
    For the segmentation plugin to work properly, you should change this to:
    
    ```
    hibernate.dialect=com.marvinformatics.hibernate.json.PostgreSQL94Dialect
    ```

Once you've completed these steps, restart the Tomcat server. Your new plugin will be available as soon 
as the restart and initialization process is completed.

