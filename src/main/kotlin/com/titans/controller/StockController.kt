package com.titans.controller

import com.titans.dto.StockPrice
import com.titans.service.StockService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/stocks")
class StockController {

    @Autowired
    private lateinit var stockService: StockService

    @GetMapping("/{symbol}",produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun getStock(@PathVariable("symbol") symbol:String):Flux<StockPrice>{
        return stockService.getStockPrice(symbol)
    }

}