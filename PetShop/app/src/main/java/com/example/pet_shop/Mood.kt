package com.example.pet_shop

abstract class Mood(val date: String)
{
    abstract fun getMood(): String
}