package br.senai.sp.jandira.mytrips.screens

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.White
            )
    ){

            Column (
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)

                ) {
                    Text(
                        text = stringResource(
                            R.string.login
                        ),
                        color = Color.Magenta,
                        fontSize = 43.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = stringResource(
                            R.string.please_sign
                        ),
                        color = Color.Gray,
                        fontSize = 13.sp,

                    )
                    OutlinedTextField(
                        value = "teste@email.com",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 120.dp)
                    )
                    OutlinedTextField(
                        value = "************",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 28.dp)
                    )
                }
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .padding(start = 245.dp)

                ) {
                    Text(
                        text = stringResource(
                            R.string.sign
                        ),
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(2.dp)
                    )
                }
                Text(
                    text = stringResource(
                        R.string.account,
                    ),
                    color = Color.Gray,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(start = 230.dp)
                )
            }
        Card(
            modifier = Modifier
                .width(150.dp)
                .height(45.dp)
                .align(alignment = Alignment.TopEnd),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color.Magenta
                ),
            shape = RoundedCornerShape(
                bottomStart = 20.dp
            )
        ) { }
        Card(
            modifier = Modifier
                .width(150.dp)
                .height(45.dp)
                .align(Alignment.BottomStart),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color.Magenta
                ),
            shape = RoundedCornerShape(
                topEnd = 20.dp
            )

        ) { }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()

}