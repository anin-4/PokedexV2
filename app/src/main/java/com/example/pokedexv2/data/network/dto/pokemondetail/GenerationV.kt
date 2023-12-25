package com.example.pokedexv2.data.network.dto.pokemondetail

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)