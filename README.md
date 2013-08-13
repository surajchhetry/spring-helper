spring-helper
=============

This is spring based framework which provides some utility classes which is required in most of the project .


How to use
----------

1  add repository in your maven

~~~~xml 
<repository>
	<id>spring-logger</id>
    	<releases>
    		<enabled>true</enabled>
    		<checksumPolicy>fail</checksumPolicy>
    	</releases>
    	<url>https://github.com/surajchhetry/spring-helper/raw/master/releases</url>
</repository>
~~~~

2  add dependency 
~~~~xml
<dependency>
	<groupId>net.surajchhetry.springhelper</groupId>
        <artifactId>spring-helper</artifactId>
        <version>0.1</version>            
</dependency>
~~~~

3  add following package (<b>net.surajchhetry</b>)  in you spring application context as below sample
   
~~~~xml
<context:component-scan base-package="net.surajchhetry" />
~~~~

4  for sample log4j.properties please go through test or sample application.

