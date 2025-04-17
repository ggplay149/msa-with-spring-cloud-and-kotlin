package com.ggplay149.UserconfigClient

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class UserController {

    @GetMapping("/test")
    fun userTest() : String{
        return "user success"
    }
}