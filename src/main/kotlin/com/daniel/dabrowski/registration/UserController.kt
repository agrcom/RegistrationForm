package com.daniel.dabrowski.registration

import com.daniel.dabrowski.registration.model.Contact
import com.daniel.dabrowski.registration.model.User
import com.daniel.dabrowski.registration.model.UserDbModel
import com.daniel.dabrowski.registration.repository.UserRepository
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@CrossOrigin(origins = arrayOf("http://localhost:4200"))
@RestController
@RequestMapping("/users")
class UserController(val repo: UserRepository) {

    @GetMapping("/")
    fun homeEndpoint(): String {
        return "Hello!\n" +
                "We have: " + repo.findAll().count() + " entries!"
    }

    @GetMapping("/demo")
    fun demoEndpoint(@RequestParam(value = "firstName", defaultValue = "World") name: String,
                     @RequestParam(value = "email", defaultValue = "test@mail.com") email: String): User {

        return User("$name", "$email",
                Contact("city", "country", 555555, "address"))
    }

    //Todo: Mapping for Db to DTO model
    @GetMapping("/fullList")
    fun findAll() : List<UserDbModel>
            = repo.findAll()

    @GetMapping("/city/{city}")
    fun findByCity(@PathVariable city: String)
            = repo.findByCity(city)

    @GetMapping("/name/{name}")
    fun findByName(@PathVariable firstName: String)
            = repo.findByFirstName(firstName)

    @PostMapping("/newUser", consumes = arrayOf("application/json"), produces = arrayOf("application/json"))
    fun addUser(@RequestBody user: User) {

        repo.save(UserDbModel(
                creationTime = LocalDateTime.now(),
                firstName = user.firstName,
                email = user.email,
                contact = user.contact
        ))

    }
}