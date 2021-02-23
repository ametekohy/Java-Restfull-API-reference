# JavaEE Restfull API reference

---
## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [References](#references)
---
## General info
This project is a reference how to build a Restfull API with JAX-RS in a JavaEE/Maven project with error handeling by using ExceptionMappers.

---
## Technologies
Project is created with:
* Java JDK (https://www.oracle.com/nl/java/technologies/javase-downloads.html)
* Maven (https://maven.apache.org/install.html)
* JavaEE dependency (https://mvnrepository.com/artifact/javax/javaee-api)

### Tool used:
* IDE: IntelliJ IDEA Ultimate Edition (https://www.jetbrains.com/idea/)
* API testing: PostMan (https://www.postman.com/downloads/)
* TomEE Plus (https://tomee.apache.org/download-ng.html)
  
---
## Setup
To run this project:
##### 1. Setup local TomEE Server: 
* Download TomEE Plus (https://tomee.apache.org/download-ng.html)
* Follow the Tomcat Setup from https://www.baeldung.com/tomcat-deploy-war

##### 2. Setup configuration TomEE Plus Server in IntelliJ IDEA:
```
1. Open the [Run] menu and click the [Edit Configurations] options.
2. In the panel on the left search for TomEE Server, if it is not there click the + sign in the menu, search for TomEE and select Local. 
   In the name field put a name for your server.
3. Click the [Configure…] button and in TomEE Home field navigate to the home location of your installation and select it.
4. Go to the "Deployment" tab and click on the [+] symbol, select the artifact you want to add to the server and click OK

```
##### 3. Deploy to TomEE server
```
1. Run the TomEE Server you configured.
2. Go to localhost:8080/health to see a reaction from the API 
```

---
## References
* Maven (https://maven.apache.org/pom.html)
* How to Deploy a WAR File to Tomcat (https://www.baeldung.com/tomcat-deploy-war)
* JavaBean Conventions (https://docstore.mik.ua/orelly/java-ent/jnut/ch06_02.htm)
* Set a Response Body in JAX-RS (https://www.baeldung.com/jax-rs-response)
* JAX-RS @PathParam example (https://mkyong.com/webservices/jax-rs/jax-rs-pathparam-example/)
* Exception Handling - Exception mappers (https://dennis-xlc.gitbooks.io/restful-java-with-jax-rs-2-0-2rd-edition/content/en/part1/chapter7/exception_handling.html)

