package com.awen.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
