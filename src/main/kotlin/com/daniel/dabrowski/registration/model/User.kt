package com.daniel.dabrowski.registration.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User(val name: String,
                val email: String,
                val contact: Contact)
