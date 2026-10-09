package com.example.tugas_3_questtugaslayout_0102

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
            .padding(top = 60.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.title),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.sub_title),
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(35.dp))

        AnimeCard(
            animeTitle = R.string.ani_title0,
            animeGenre = R.string.ani_genre0,
            animeDescription = R.string.ani_desc0,
            animeImage = R.drawable.kakushigoto,
            cardColor = R.color.card_0_bg,
            genreColor = R.color.card_0_genre,
            descColor = R.color.card_0_desc
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}

@Composable
fun AnimeCard(
    animeTitle: Int,
    animeGenre: Int,
    animeDescription: Int,
    animeImage: Int,
    cardColor: Int,
    modifier: Modifier = Modifier,
    titleColor: Int = R.color.white,
    genreColor: Int = R.color.card_0_genre,
    descColor: Int = R.color.card_0_desc
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(cardColor)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(animeImage),
                contentDescription = null,
                modifier = Modifier.size(65.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(animeTitle),
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(titleColor)
                )
                Text(
                    text = stringResource(animeGenre),
                    fontSize = 12.sp,
                    color = colorResource(genreColor),
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    text = stringResource(animeDescription),
                    fontSize = 12.sp,
                    color = colorResource(descColor),
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
            Image(
                painter = painterResource(R.drawable.bookmark),
                contentDescription = "Bookmark",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}
