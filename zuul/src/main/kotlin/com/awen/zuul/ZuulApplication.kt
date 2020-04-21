package com.awen.zuul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
class ZuulApplication

fun main(args: Array<String>) {
    runApplication<ZuulApplication>(*args)
}
