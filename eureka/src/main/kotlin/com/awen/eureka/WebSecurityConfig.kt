package com.awen.eureka

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableWebSecurity
class WebSecurityConfig: WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http)
    }

}