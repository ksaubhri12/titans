package com.titans

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [MongoReactiveAutoConfiguration::class])
class TitansApplication

fun main(args: Array<String>) {
    runApplication<TitansApplication>(*args)
}
