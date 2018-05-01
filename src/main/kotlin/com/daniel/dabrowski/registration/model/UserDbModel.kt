package com.daniel.dabrowski.registration.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "user")
class UserDbModel(val creationTime: LocalDateTime,
                  val name: String,
                  val email: String,
                  val contact: Contact) {
}