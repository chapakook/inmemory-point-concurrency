package com.chapakook.labs.inmemorypointconcurrency

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InmemoryPointConcurrencyApplication

fun main(args: Array<String>) {
    runApplication<InmemoryPointConcurrencyApplication>(*args)
}
