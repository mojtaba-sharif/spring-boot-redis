package me.ramon.springbootredis

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@SpringBootApplication
class SpringBootRedisApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootRedisApplication::class.java, *args)
}
