package com.kotlin.firstKotlinProject.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.Builder
import lombok.Data
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
data class Message(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id:Int?,
    val text:String)