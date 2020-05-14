package com.titans.model

import org.springframework.data.annotation.Id


data class Users(val name: String, val email: String, val phone: String) {

    @Id
    var id: Int? = null
}