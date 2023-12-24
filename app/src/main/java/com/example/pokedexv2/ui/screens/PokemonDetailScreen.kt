package com.example.pokedexv2.ui.screens

import android.os.Build.VERSION.SDK_INT
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.example.pokedexv2.R
import com.example.pokedexv2.ui.theme.aquaBlue
import com.example.pokedexv2.ui.theme.borderRadius
import com.example.pokedexv2.ui.theme.spacing

@Composable
fun PokemonDetailScreen() {
    Column{
        PokeDexDetailScreenImageSection()
        PokemonDetailScreenStatSection(
            modifier = Modifier.padding(horizontal = MaterialTheme.spacing.large)
        )
    }
}

@Composable
fun PokemonDetailScreenStatSection(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Wartortle",
            style = MaterialTheme
                .typography
                .headlineLarge
                .copy(fontWeight = FontWeight.SemiBold)
        )
        Text(
            text = "Nº007",
            style = MaterialTheme
                .typography
                .titleMedium
                .copy(
                    fontWeight = FontWeight.W700,
                    color = Color(0xB2000000)
                ),
            modifier = Modifier.offset(y = (-7).dp)
        )
        Spacer(modifier = Modifier.height(6.dp))

        PokeDexItemCardBottomHighLightText()

        Spacer(modifier = Modifier.height(20.dp))
        topStatSection()

        Spacer(modifier = Modifier.height(20.dp))
        BaseStatsSection()
    }
}

@Composable
fun PokeDexDetailScreenImageSection(modifier: Modifier = Modifier) {
    Box(modifier = modifier){
        PokemonDetailScreenImageBackground()
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp)
        ) {
            PokeGifImage(
                modifier = Modifier
                    .size(200.dp)
            )
        }

    }
}



@Composable
fun PokemonDetailScreenImageBackground(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
            .clip(RoundedCornerShape(bottomStartPercent = 50, bottomEndPercent = 50))
            .background(color = aquaBlue),
    ) {
        Image(
            painter = painterResource(id = R.drawable.elemento_outline),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
                .align(alignment = Alignment.Center)
        )
    }
}

@Composable
fun BaseStatsSection() {
    Column {
        Text(
            "Base Stats",
            style = MaterialTheme.typography.titleMedium.copy(fontSize = 16.sp)
        )

        StatsProgressBar(
            header = "HP",
            percentage = 0.6f
        )
        StatsProgressBar(
            header = "Attack",
            percentage = 0.8f
        )
        StatsProgressBar(
            header = "Defense",
            percentage = 0.4f
        )
        StatsProgressBar(
            header = "Speed",
            percentage = 0.3f
        )

    }
    
}

@Composable
fun StatsProgressBar(
    header: String,
    percentage:Float,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = header,
            style = MaterialTheme
                .typography
                .titleMedium
                .copy(
                    fontWeight = FontWeight.W400,
                    color = Color(0xB2000000)
                )
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
                .clip(shape = RoundedCornerShape(MaterialTheme.borderRadius.extraExtraLarge))
                .background(Color.LightGray)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(percentage)
                    .clip(shape = RoundedCornerShape(MaterialTheme.borderRadius.extraExtraLarge))
                    .background(aquaBlue)
                    .padding(horizontal = 8.dp)
            ) {
//            Text(
//                text = statName,
//                fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = (curPercent.value * statMaxValue).toInt().toString(),
//                fontWeight = FontWeight.Bold
//            )
            }
        }
    }

}

@Composable
fun topStatSection() {
    Column {
        Text(
            "Physical Stats",
            style = MaterialTheme.typography.titleMedium.copy(fontSize = 16.sp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            InfoContainer(
                icon = R.drawable.la_weight_hanging,
                text = "9.0 kg",
                header = "Weight",
                modifier = Modifier.width(154.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            InfoContainer(
                icon = R.drawable.ant_design_column_height_outlined,
                text = "0.5 m",
                header = "Height",
                modifier = Modifier.width(154.dp)
            )
        }
        
        Spacer(modifier = Modifier.height(6.dp))


        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            InfoContainer(
                icon = R.drawable.iconoir_pokeball__1_,
                text = "Water Gun",
                header = "Ability",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
    
}

@Composable
fun InfoContainer(
    icon:Int,
    text:String,
    header:String,
    modifier: Modifier = Modifier
) {
    Column {
        Row {
            Image(painter = painterResource(id = icon), contentDescription = "")
            Text(
                header,
                style = MaterialTheme
                    .typography
                    .labelMedium
                    .copy(
                        color = Color(0x99000000),
                        letterSpacing = 0.6.sp
                    )
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .border(
                    1.dp,
                    Color(0x1A000000),
                    shape = RoundedCornerShape(MaterialTheme.borderRadius.large)
                )
                .padding(8.dp),
        ) {
            Text(
                text = text,
                style = MaterialTheme
                    .typography
                    .bodyMedium
                    .copy(
                        fontWeight = FontWeight.W500,
                        fontSize = 15.sp
                    )
            )
        }
    }
}



@Composable
fun PokeGifImage(
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest
                .Builder(context)
                .data(data =
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/8.gif"
//                ""
                ).apply(block = {
                size(Size.ORIGINAL)
            }).build(), imageLoader = imageLoader
        ),
        contentDescription = null,
        modifier =  modifier
    )
}