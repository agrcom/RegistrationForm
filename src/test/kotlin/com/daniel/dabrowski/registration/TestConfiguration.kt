package com.daniel.dabrowski.registration

import com.github.fakemongo.Fongo
import com.mongodb.MongoClient
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.data.mongodb.config.AbstractMongoConfiguration

@Configuration
class TestConfguration : AbstractMongoConfiguration() {

    @Autowired
    lateinit var env: Environment

    private val logger = KotlinLogging.logger {}

    override fun getDatabaseName() =
            env.getProperty("mongo.db.name", "test")

    override fun mongoClient(): MongoClient {
        logger.info("Instantiating Fongo with name $databaseName.")
        print("Instantiating Fongo with name $databaseName.")
        return Fongo(databaseName).mongo
    }
}