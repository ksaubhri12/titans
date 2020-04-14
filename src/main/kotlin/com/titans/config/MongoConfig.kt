package com.titans.config

import com.mongodb.reactivestreams.client.MongoClients
import com.titans.repository.TweetRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories


@Configuration
@EnableReactiveMongoRepositories(
        basePackageClasses = [TweetRepository::class]
)
class MongoConfig:AbstractReactiveMongoConfiguration() {

    override fun reactiveMongoClient() = mongoClient()

    override fun getDatabaseName() = "mydatabase"


    @Bean
    fun mongoClient() = MongoClients.create()

    @Bean
    override fun reactiveMongoTemplate() = ReactiveMongoTemplate(mongoClient(),databaseName)

}