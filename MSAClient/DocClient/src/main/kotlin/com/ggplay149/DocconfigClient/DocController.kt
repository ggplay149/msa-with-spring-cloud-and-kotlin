package com.ggplay149.DocconfigClient

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/doc")
class DocController {

    @GetMapping("/test")
    fun userTest() : String{
        return "doc success"
    }
}