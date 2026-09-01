package com.example.pet_shop

abstract class Pet(val name: String, var age: Int)
{
    abstract fun speak(): String
}