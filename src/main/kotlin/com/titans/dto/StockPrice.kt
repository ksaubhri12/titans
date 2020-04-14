package com.titans.dto

import java.time.LocalDateTime
import java.util.concurrent.ThreadLocalRandom

data class StockPrice(var symbol: String,
                      var price: Double,
                      var time: LocalDateTime) {


    fun validate() {
        if (false) {
            throw Exception()
        }
    }
}