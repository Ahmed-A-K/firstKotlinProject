package com.kotlin.firstKotlinProject.service

import com.kotlin.firstKotlinProject.entity.Message
import com.kotlin.firstKotlinProject.repository.MessageRepository
import org.springframework.stereotype.Service
import lombok.RequiredArgsConstructor
@Service
class MessageService(private val messageRepository: MessageRepository) {

    fun saveMessage(id: Int,text: String) {
        val msg = Message(id,text)
        messageRepository.save(msg)
        println("Message saved")
    }
}