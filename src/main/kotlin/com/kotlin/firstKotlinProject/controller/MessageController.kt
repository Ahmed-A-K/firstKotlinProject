package com.kotlin.firstKotlinProject.controller

import com.kotlin.firstKotlinProject.entity.Message
import com.kotlin.firstKotlinProject.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class MessageController(private val messageService: MessageService) {

    @GetMapping("/")
    fun msg(@RequestParam("name",required = true) name:String?) : String = "Hello ${name?:""}"

    @GetMapping("/v1")
    fun msg() = listOf(
        Message(1,"Hello"),
        Message(2,"Good morning"),
        Message(3,"Good night"),
    )

    @PostMapping("/save/{id}/{text}")
    fun saveData(@PathVariable id: Int, @PathVariable text: String) {
        messageService.saveMessage(id,text);
    }
}