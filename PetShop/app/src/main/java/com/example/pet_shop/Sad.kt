package com.example.pet_shop

class Sad(date: String): Mood(date) {
    override fun getMood(): String {
        return "Aww"
    }
}
