package com.example.pokedexv2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pokedexv2.R
import com.example.pokedexv2.ui.theme.aquaAnimalBackground
import com.example.pokedexv2.ui.theme.aquaBlue
import com.example.pokedexv2.ui.theme.borderRadius
import com.example.pokedexv2.ui.theme.spacing

@Composable
fun PokeDexItemCard(
//    pokemonNumber :Int,
//    pokemonName :String,
//    pokemonType:String,
//    pokemonImageUrl:String,
) {
    Card(
        modifier = Modifier
            .padding(MaterialTheme.spacing.large)
            .fillMaxWidth()
            .height(126.dp)
            .clip(RoundedCornerShape(MaterialTheme.borderRadius.large)),
        shape = RoundedCornerShape(MaterialTheme.borderRadius.large),
        colors = CardDefaults.cardColors(
            containerColor = aquaAnimalBackground,
        )
    ) {
        Row{
            Column(
                modifier = Modifier.weight(1F).padding(MaterialTheme.spacing.large)
            ) {
                Text(
                    text = "Nº007",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "Wartortle",
                    style = MaterialTheme.typography.titleLarge
                )
                PokeDexItemCardBottomHighLightText()
            }

            PokeDexItemCardRightComposable()
        }

    }
}

@Composable
fun PokeDexItemCardBottomHighLightText() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .width(66.dp)
            .height(26.dp)
            .clip(RoundedCornerShape(MaterialTheme.borderRadius.extraExtraLarge))
            .background(color = aquaBlue)
            .padding(6.dp)
    ){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(20.dp)
                .clip(shape = CircleShape)
                .background(color = Color.White)
        ){
            Image(
                painter = painterResource(id = R.drawable.water),
                contentDescription = "",
                modifier = Modifier.size(12.dp)
            )
        }
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = "Water",
            style = MaterialTheme.typography.labelMedium
        )
    }
}


@Composable
fun PokeDexItemCardRightComposable() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(130.dp)
            .height(126.dp)
            .clip(RoundedCornerShape(MaterialTheme.borderRadius.large))
            .background(color = aquaBlue),
    ) {
        Image(
            painter = painterResource(id = R.drawable.elemento_outline),
            contentDescription = "",
            modifier = Modifier.size(94.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.image_129),
            contentDescription = "",
            modifier = Modifier.size(100.dp)
         )

    }
}