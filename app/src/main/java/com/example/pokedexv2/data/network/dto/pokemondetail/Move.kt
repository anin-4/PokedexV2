package com.example.pokedexv2.data.network.dto.pokemondetail

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)