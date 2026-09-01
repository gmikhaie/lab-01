package com.example.pet_shop

class Sad(activity: String): Mood(activity) {
    override fun getMood(): String {
        return "Yay"
    }
}