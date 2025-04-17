package com.ggplay149.UserconfigClient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class UserconfigClientApplication

fun main(args: Array<String>) {
	runApplication<UserconfigClientApplication>(*args)
}
