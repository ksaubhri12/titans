package com.titans.service

import com.titans.dto.TweetResponse
import com.titans.repository.TweetRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

class TweetService(
        private val tweetRepository: TweetRepository
) {

    fun getExploreTweets():Flux<String>{
        val normalTweets = tweetRepository.getAllTweetsFromOneDB()
        val anotherTweets = tweetRepository.getAllTweetsFromSecondTableWithJoin()
        return Flux.just("kalpesh","kacondc")
    }


}