package me.ramon.springbootredis

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Mojtaba on 8/13/2017.
 */
@RestController
@RequestMapping("")
class IndexController {

    @GetMapping
    @ResponseBody
    fun inde(): String {
        return "hello kotlin"
    }
}

