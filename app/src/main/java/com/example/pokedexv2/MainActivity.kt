package com.example.pokedexv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pokedexv2.ui.screens.PokeDexItemCard
import com.example.pokedexv2.ui.theme.PokedexV2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexV2Theme {
                PokeDexItemCard()
            }
        }
    }
}