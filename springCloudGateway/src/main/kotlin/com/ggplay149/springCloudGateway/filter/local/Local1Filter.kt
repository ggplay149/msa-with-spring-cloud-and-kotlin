package com.ggplay149.springCloudGateway.filter.local

import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class Local1Filter : AbstractGatewayFilterFactory<Local1Filter.Config>(Config::class.java) {

    data class Config(
        var pre: Boolean = false,
        var post: Boolean = false
    )

    override fun apply(config: Config): GatewayFilter {
        return@apply GatewayFilter { exchange, chain ->
            if (config.pre) {
                println(":: pre local filter 1::")
            }
            return@GatewayFilter chain.filter(exchange)
                .then(Mono.fromRunnable {
                    if (config.post) {
                        println(":: post local filter 1::")
                    }
                })
        }
    }
}