package com.example.pet_shop

abstract class Mood(val activity: String)
{
    abstract fun getMood(): String
}