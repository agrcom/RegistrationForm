# RegistrationForm [![Pure Kotlin](https://img.shields.io/badge/100%25-kotlin-blue.svg)](https://kotlinlang.org/).  
Simple REST project, main purpose is check possibility of Kotlin and Spring Boot

## Docker commands
create docker image:

    mvn install dockerfile:build
    
run app: 
    
    docker run -p 8080:8080 -t agrcom/registration.form
    
run DB

    http://mydevgeek.com/angular-4-crud-application-with-spring-boot-rest-service-part-2/
    
## Swagger

Now you can test it in your browser by visiting 
    
    http://localhost:8080/swagger-ui.html
    
## Kotlin-logging
Lightweight logging framework for Kotlin

    https://github.com/MicroUtils/kotlin-logging
    
##### Maven:
```xml
<dependency>
  <groupId>io.github.microutils</groupId>
  <artifactId>kotlin-logging</artifactId>
  <version>1.4.9</version>
</dependency>
```


# Client

### Angular

ng serve

Client side and integration strngly inspired by articles:

    https://mydevgeek.com/angular-4-crud-application-with-spring-boot-rest-service-part-1/
    https://mydevgeek.com/angular-4-crud-application-with-spring-boot-rest-service-part-2/