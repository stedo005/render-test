package de.stedo.rendertest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RenderTestApplication

fun main(args: Array<String>) {
	runApplication<RenderTestApplication>(*args)
}
