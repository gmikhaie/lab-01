package com.example.pet_shop

class Cat(name: String, age: Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "Meow"
    }

    override fun pet() {
        println("Can be pet")
    }
}