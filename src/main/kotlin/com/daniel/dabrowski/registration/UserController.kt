package com.daniel.dabrowski.registration

import com.daniel.dabrowski.registration.model.Contact
import com.daniel.dabrowski.registration.model.User
import com.daniel.dabrowski.registration.model.UserDbModel
import com.daniel.dabrowski.registration.repository.UserRepository
import com.mongodb.MongoClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoDbFactory
import org.springframework.web.bind.annotation.*
import java.time.Instant
import java.time.LocalDateTime

@RestController
class UserController(val repo: UserRepository) {

    //var mongoOps: MongoOperations = MongoTemplate(SimpleMongoDbFactory(MongoClient(), "local"))

    @GetMapping("/")
    fun homeEndpoint(): String {
        return "Hello!\n" +
                "We have: " + repo.findAll().count() + " entries!"
    }

    @GetMapping("/demo")
    fun demoEndpoint(@RequestParam(value = "name", defaultValue = "World") name: String,
                     @RequestParam(value = "email", defaultValue = "test@mail.com") email: String): User {

        val usr = User("$name", "$email",
                Contact("city", "country", 555555, "address"))

        repo.save(usr)

        return usr
    }

    @GetMapping("/city/{city}")
    fun findByCity(@PathVariable city: String)
            = repo.findByCity(city)

    @GetMapping("/name/{name}")
    fun findByName(@PathVariable name: String)
            = repo.findByName(name)

    @PostMapping("/newUser")
    fun addUser(@RequestParam user: User): UserDbModel {
        return UserDbModel(
                creationTime = LocalDateTime.now(),
                name = user.name,
                email = user.email,
                contact = user.contact
        )

    }
}