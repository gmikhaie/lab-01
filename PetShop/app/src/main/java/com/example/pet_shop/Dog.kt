package com.example.pet_shop

class Dog(name: String, age: Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "bark"
    }

    override fun pet() {
        println("Can be pet")
    }
}