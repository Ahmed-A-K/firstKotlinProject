package com.kotlin.firstKotlinProject.repository

import com.kotlin.firstKotlinProject.entity.Message
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
interface MessageRepository: JpaRepository<Message,Int> {
}