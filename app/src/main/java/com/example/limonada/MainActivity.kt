package com.example.limonada

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.limonada.ui.theme.LimonadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LimonadaTheme {
                Limonada()
            }
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun Limonada() {
    var tela by remember { mutableStateOf(1) }
    var idImage = 1
    var idString = 1
    var onClickImagem:()->Unit ={}
        when (tela) {
            1 -> {
                idImage = R.drawable.lemon_squeeze
                idString = R.string.limao
                onClickImagem = { tela = 2 }
            }
            2 ->{
                idImage = R.drawable.lemon_drink
                idString = R.string.limonada
                onClickImagem = { tela = 3 }
            }
            3 ->
            {
            idImage = R.drawable.lemon_restart
            idString = R.string.copo_vazio
                onClickImagem = { tela = 4 }
            }
            4 ->
            {
                idImage = R.drawable.lemon_tree
                idString = R.string.limoeiro
                onClickImagem = { tela = 5 }
            }


    }




            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lemon_tree),
                    contentDescription = null,
                    modifier = Modifier
                        .size(250.dp)
                        .clickable { }

                )
                Um(text = stringResource(R.string.limoeiro))


            }
        }



@Composable
fun Um(text:String){
    Text(
        text = text,
        fontSize = 20.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
        color = Color.Black,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                end = 8.dp,
                top = 24.dp
            )
    )
}
