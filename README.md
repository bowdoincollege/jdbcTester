# jdbcTester
JDBC Tester for application databases

This is a quick and dirty jdbc testing application which can be used to debug database connections from application servers.

## Things you'll need:

Eclipse (or another Java IDE)
Maven
your Database Connection String

To use this, download the source control to your computer and open in Eclipse.  Update the project with maven and open the JdbcTesterApplication.java file

Then on line 38, update the connection string to what you need.  If you are connecting to a Banner Oracle database all you will need to update are the host, port, service_name, USER, and PASSWORD

Build the application and deployt it to the server you wish to test, running the application with:

java -jar jdbcTesterApplication-1.0.0.jar (or whatever you build the application as).  This application was built with Java 1.8, so be sure to use that if you can.
