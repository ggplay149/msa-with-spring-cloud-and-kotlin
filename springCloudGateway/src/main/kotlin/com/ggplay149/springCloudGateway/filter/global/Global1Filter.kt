package com.ggplay149.springCloudGateway.filter.global

import org.springframework.cloud.gateway.filter.GatewayFilterChain
import org.springframework.cloud.gateway.filter.GlobalFilter
import org.springframework.core.Ordered
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

@Component
class Global1Filter : GlobalFilter, Ordered{
    override fun filter(exchange: ServerWebExchange?, chain: GatewayFilterChain): Mono<Void> {
        println(":: pre global filter order -1 ::")
        return chain.filter(exchange)
            .then(Mono.fromRunnable{
                println(":: post global filter order -1 ::")
            })
    }

    override fun getOrder(): Int = -1

}