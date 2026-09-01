package com.example.pet_shop

class Happy(date: String): Mood(date) {
    override fun getMood(): String {
        return "Yay"
    }
}