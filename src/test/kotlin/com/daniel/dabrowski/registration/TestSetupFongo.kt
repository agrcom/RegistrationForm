package com.daniel.dabrowski.registration

import com.daniel.dabrowski.registration.model.Contact
import com.daniel.dabrowski.registration.model.User
import com.daniel.dabrowski.registration.repository.UserRepository
import com.github.fakemongo.junit.FongoRule
import mu.KotlinLogging
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
abstract class TestSetupFongo(val initializeTestData: Boolean = true) {

    @get:Rule
    val fongoRule = FongoRule()

    val logger = KotlinLogging.logger {}

    @Autowired
    lateinit var userRepo: UserRepository

    @Before
    fun setupTestDatabase() {
        if (initializeTestData) {
            logger.info { "Adding Test Data" }
            userRepo.save(User("Dan", "mail@mail.com", Contact("Lodz","Poland", 77777, "line 1")))
            userRepo.save(User("Jan", "mail2@mail.com", Contact("Boston","USA", 666666, "line 1")))
            userRepo.save(User("John", "mail3@mail.com", Contact("London","UK", 888888, "line 1")))
            userRepo.save(User("Smith", "mai4l@mail.com", Contact("London","UK", 99999, "line 1")))
            userRepo.save(User("Greg", "mail5@mail.com", Contact("Lodz","Poland", 323232, "line 1")))
        }
    }

}