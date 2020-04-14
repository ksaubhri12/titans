package com.titans.controller

import com.titans.model.Tweet
import com.titans.repository.TweetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/tweet")
class TweetController (
        private val tweetRepository:TweetRepository
)
{

    @PostMapping("")
    fun postTweet(@RequestBody tweet: Tweet):Mono<Tweet>{
        return tweetRepository.save(tweet)
    }

    @GetMapping("")
    fun getAllTweet():Flux<Tweet>{
        return tweetRepository.findAll()
    }

    @GetMapping("/words-count")
    fun getTweetWordsCount():Flux<Int>{

          return tweetRepository.findAll().map { tweet ->  tweet.text.length  }.defaultIfEmpty(0)
    }

    @DeleteMapping("/{id}")
    fun deleteTweetById(@PathVariable("id") id:String):Mono<ResponseEntity<Void>>{

        return tweetRepository.deleteById(id).then(Mono.just(ResponseEntity<Void>(HttpStatus.OK)))

    }

}