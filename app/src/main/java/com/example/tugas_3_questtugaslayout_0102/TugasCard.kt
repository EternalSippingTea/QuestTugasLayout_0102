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

        Cardblock()
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
fun Cardblock(
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
            .fillMaxWidth(1f)
            .padding(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.card_0_bg)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val gambar = painterResource(R.drawable.umylogo)
            val gambar2 = painterResource(R.drawable.ti)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(65.dp).padding(4.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    stringResource(R.string.nama),
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.White
                )
                Text(
                    stringResource(R.string.nim),
                    fontSize = 14.sp,
                    color = Color.Blue,
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    stringResource(R.string.alamat),
                    fontSize = 14.sp,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
            Image(
                painter = gambar2,
                contentDescription = null,
                modifier = Modifier.size(65.dp).padding(4.dp)
            )
        }
    }
}
