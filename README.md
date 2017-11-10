# jdbcTester
JDBC Tester for application databases

This is a quick and dirty jdbc testing application which can be used to debug database connections from application servers.

## Things you'll need:

.*Eclipse (or another Java IDE)
.*Maven
.*ojdbc6.jar file from http://www.oracle.com/technetwork/database/features/jdbc/jdbc-drivers-12c-download-1958347.html
.*your Database Connection String

## How To Use:

First you will want to add an ojdbc6.jar file to this project's maven repository. You will do this by downloading the appropriate ojdbc6.jar file from the link above, and running the following maven command (substituting the correct directories where needed)

mvn install:install-file -Dfile={Path/to/your/ojdbc6.jar} -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion={Version Number on Website} -Dpackaging=jar

To use this, download the source control to your computer and open in Eclipse.  Update the project with maven and open the JdbcTesterApplication.java file

Then on line 38, update the connection string to what you need.  If you are connecting to a Banner Oracle database all you will need to update are the host, port, service_name, USER, and PASSWORD

Build the application and deployt it to the server you wish to test, running the application with:

java -jar jdbcTesterApplication-1.0.0.jar (or whatever you build the application as).  This application was built with Java 1.8, so be sure to use that if you can.
