package com.example.pet_shop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pet_shop.ui.theme.Pet_shopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val cat = Cat("Lily", 6)
        val dog = Dog("Chico", 6)
        val scorpion = Scorpion("Spiderman", 32)

        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)

        val moods = mutableListOf<Mood>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)

        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)
    //  pettablePets.add(scorpion)

    }
}
