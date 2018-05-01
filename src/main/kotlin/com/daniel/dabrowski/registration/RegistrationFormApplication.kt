package com.daniel.dabrowski.registration

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class RegistrationFormApplication

fun main(args: Array<String>) {
    runApplication<RegistrationFormApplication>(*args)
}

