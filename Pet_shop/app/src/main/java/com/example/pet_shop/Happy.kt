package com.example.pet_shop

class Happy(activity: String): Mood(activity) {
    override fun getMood(): String {
        return "Yay"
    }
}