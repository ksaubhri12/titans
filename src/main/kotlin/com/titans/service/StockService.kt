package com.titans.service

import com.titans.dto.StockPrice
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import java.time.Duration
import java.time.LocalDateTime
import java.util.concurrent.ThreadLocalRandom

@Service
class StockService {

    fun getStockPrice(symbol :String):Flux<StockPrice>{
        return Flux.interval(Duration.ofSeconds(1))
                .map { StockPrice(symbol,ThreadLocalRandom.current().nextDouble(100.0), LocalDateTime.now()) }
    }


}