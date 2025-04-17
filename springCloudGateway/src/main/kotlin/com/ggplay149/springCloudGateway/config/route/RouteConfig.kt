package com.ggplay149.springCloudGateway.config.route

import com.ggplay149.springCloudGateway.filter.local.Local1Filter
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RouteConfig {

    @Bean
    fun ms1Route(builder: RouteLocatorBuilder): RouteLocator = builder.routes()
        .route("ms1")
        {
            it.path("/ms1/**")
                .filters { f -> f.stripPrefix(1) }
                .uri("http://localhost:2001")
        }
        .route("ms2")
        {
            it.path("/ms2/**")
                .filters { f -> f
                    .stripPrefix(1)
                    .filter(Local1Filter().apply(Local1Filter.Config(true,true)))
                }
                .uri("http://localhost:2002")
        }
        .route("ms3")
        {
            it.path("/ms3/**")
                .filters { f -> f.stripPrefix(1) }
                .uri("http://localhost:2003")
        }
        .build()
}