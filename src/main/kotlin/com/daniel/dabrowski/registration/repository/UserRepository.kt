package com.daniel.dabrowski.registration.repository

import com.daniel.dabrowski.registration.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface UserRepository:MongoRepository<User, String> {

    fun findByName(name: String): List<User>

    @Query("{'contact.city': ?0}")
    fun findByCity(city: String): List<User>

    @Query("{'contact.telephone': ?0}")
    fun findByTelephone(address: Long): List<User>
}