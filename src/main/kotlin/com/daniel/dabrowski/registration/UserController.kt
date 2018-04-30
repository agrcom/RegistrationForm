package com.daniel.dabrowski.registration

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/")
    fun homeEndpoint() : String{
        return "Hello!"
    }

    @GetMapping("/demo")
    fun demoEndpoint(@RequestParam(value = "name", defaultValue = "World") name: String,
                     @RequestParam(value = "password", defaultValue = "dupa123") password: String,
                     @RequestParam(value = "email", defaultValue = "test@mail.com") email: String): User {
        return User("$name", "$password", "$email")
    }
}