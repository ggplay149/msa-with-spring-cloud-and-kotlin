package com.ggplay149.OrderconfigClient

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/order")
class OrderController {

    @GetMapping("/test")
    fun userTest() : String{
        return "order success"
    }
}