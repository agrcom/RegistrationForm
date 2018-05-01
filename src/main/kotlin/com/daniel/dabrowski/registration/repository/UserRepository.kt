package com.daniel.dabrowski.registration.repository

import com.daniel.dabrowski.registration.model.User
import com.daniel.dabrowski.registration.model.UserDbModel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface UserRepository:MongoRepository<UserDbModel, String> {

    fun findByName(name: String): List<UserDbModel>

    @Query("{'contact.city': ?0}")
    fun findByCity(city: String): List<UserDbModel>

    @Query("{'contact.telephone': ?0}")
    fun findByTelephone(telephone: Long): List<UserDbModel>
}