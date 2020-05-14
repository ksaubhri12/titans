package com.titans.controller

import com.titans.model.Users
import com.titans.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono


@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    lateinit var userRepository: UserRepository


    @GetMapping("/{id}")
    fun findUserById(@PathVariable id:Long):Mono<Users> {
        return userRepository.findById(id)
    }

    @PostMapping
    fun add (@RequestBody user: Users) :Mono<Users>
    {
        return userRepository.save(user)
    }


}