package com.daniel.dabrowski.registration

import com.daniel.dabrowski.registration.model.Contact
import com.daniel.dabrowski.registration.model.User
import com.daniel.dabrowski.registration.repository.UserRepository
import com.mongodb.MongoClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoDbFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val repo : UserRepository) {

    //var mongoOps: MongoOperations = MongoTemplate(SimpleMongoDbFactory(MongoClient(), "local"))

    @GetMapping("/")
    fun homeEndpoint() : String{
        return "Hello!"
    }

    @GetMapping("/demo")
    fun demoEndpoint(@RequestParam(value = "name", defaultValue = "World") name: String,
                     @RequestParam(value = "password", defaultValue = "dupa123") password: String,
                     @RequestParam(value = "email", defaultValue = "test@mail.com") email: String): User {

        val usr = User("$name", "$password", "$email",
                Contact("city","country",555555, "address"))

        repo.save(usr)

        return usr
    }

}