package com.example.demo2

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}! ${Platform().currentTime}"
    }
}