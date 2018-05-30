# Cresco-HelloWorld-Plugin
The Cresco HelloWorld Plugin performs a very basic piece of work, displays a log message, and subsequently removes itself.

##### Requirements
* Java JDK 1.8+
* Maven 3

##### Compiling the JAR file:
All the Maven plugins and code necessary to generate a JAR file are included in the existing `pom.xml`. In order to create the plugin JAR file, simply issue the following command:
```java
mvn clean package
```
This will generate the file `cresco-helloworld-plugin-0.1.0.jar` in the `target/` directory which can then be read/loaded by the Cresco framework.

##### Loading the Plugin:

There are two ways to load the plugin file in Cresco: 
1) Manually in the `plugins.ini` file
```
[plugins]
plugin/0=0
plugin/1=1                                                  > Add this line (with 1 for enabled)

...

[plugin/1]                                                 \
pluginname = cresco-helloworld-plugin                       > Add this block as well
jarfile = path/to/cresco-helloworld-plugin-0.1.0.jar       /
```
1) Or by uploading the JAR file and building an application using the [Cresco-Agent-Dashboard-Plugin](https://github.com/ResearchWorx/Cresco-Agent-Dashboard-Plugin) documentation.