package com.titans.repository

import com.titans.model.Tweet
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface TweetRepository :ReactiveMongoRepository<Tweet,String> {

//    fun getAllTweetsFromOneDB():Flux<Tweet>{}



//    fun getAllTweetsFromSecondTableWithJoin():Flux<Tweet>{}

}