# RegistrationForm
Simple REST project, main purpose is check possibility of Kotlin and Spring Boot

#Docker commands
create docker image:

    mvn install dockerfile:build
    
run app: 
    
    docker run -p 8080:8080 -t agrcom/registration.form