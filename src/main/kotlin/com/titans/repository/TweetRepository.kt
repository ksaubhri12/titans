package com.titans.repository

import com.titans.model.Tweet
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface TweetRepository :ReactiveMongoRepository<Tweet,String> {
}