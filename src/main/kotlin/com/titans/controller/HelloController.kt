package com.titans.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.Duration

@RestController
class HelloController {

    @GetMapping("/hello")
    fun helloWorld():Flux<String>{
        return Flux.interval(Duration.ofSeconds(2))
                .map { "Hello World" }
    }

}