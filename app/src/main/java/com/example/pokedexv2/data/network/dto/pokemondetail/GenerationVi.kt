package com.example.pokedexv2.data.network.dto.pokemondetail

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire")
    val omegaRubyAlphaSapphire: OmegarubyAlphasapphire,
    @SerializedName("x-y")
    val xY: XY
)