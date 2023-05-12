package de.stedo.rendertest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class SayHello {
    @GetMapping
    fun sayHello() = "guten Tag Sie haben gewonnen :)"
}