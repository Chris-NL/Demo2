package com.example.demo2

expect class Platform() {
    val platform: String

    val systemCurrentTimeMillis: Long

    val currentTime: String

}