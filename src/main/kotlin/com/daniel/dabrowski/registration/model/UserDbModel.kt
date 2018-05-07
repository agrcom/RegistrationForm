package com.daniel.dabrowski.registration.model

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "user")
class UserDbModel(val creationTime: LocalDateTime,
                  val firstName: String,
                  val email: String,
                  val contact: Contact) {
}