package com.daniel.dabrowski.registration

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User(val name: String,
                val password:String,
                val email: String,
                val contact: Contact)
