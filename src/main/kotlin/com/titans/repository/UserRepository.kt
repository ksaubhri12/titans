package com.titans.repository

import com.titans.model.Users
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface UserRepository:ReactiveCrudRepository<Users,Long> {
}