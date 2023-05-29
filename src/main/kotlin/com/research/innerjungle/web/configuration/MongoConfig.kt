package com.research.innerjungle.web.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration

@Configuration
class MongoConfig : AbstractMongoClientConfiguration() {

    @Value("\${spring.mongodb.uri}")
    private lateinit var mongoUri: String

    override fun getDatabaseName(): String {
        return mongoUri.substringAfterLast("/")
    }
}
