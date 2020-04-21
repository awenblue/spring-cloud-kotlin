package com.awen.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
class EurekaApplication

fun main(args: Array<String>) {
    runApplication<EurekaApplication>(*args)
}
