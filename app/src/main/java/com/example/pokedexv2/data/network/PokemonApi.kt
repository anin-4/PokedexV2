package com.example.pokedexv2.data.network

import com.example.pokedexv2.data.network.dto.pokemondetail.PokemonDetails
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {

    @GET("pokemon/{pokemonNumber}")
    suspend fun getPokemonDetails(
        @Path("pokemonNumber") pokemonNumber:Int
    ):Response<PokemonDetails>
}