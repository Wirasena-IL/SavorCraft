package com.example.savorcraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.savorcraft.ui.theme.SavorCraftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SavorCraftTheme {

            }
        }
    }
}

@Composable
fun Onboarding() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFFFFF)
    ) {

    }
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.login1),
            contentDescription = "Login Image",
            modifier = Modifier
                .size(width = 287.dp, height = 287.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 57.dp)

        )
        Text(
            text = "Masuk",
            style = TextStyle(
                fontSize = 40.sp,
                lineHeight = 44.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF374151),
            ),
            modifier = Modifier
                .padding(top = 296.dp)
                .width(128.dp)
                .height(44.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            modifier = Modifier
                .padding(top = 26.dp)
                .align(Alignment.CenterHorizontally),
            text = "Selamat datang kembali! Masuk",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF6B7280),
                textAlign = TextAlign.Center,
            )
        )

        IconButton(
            onClick = { /*TODO*/ } ,
            modifier = Modifier
                .width(320.dp)
                .height(51.dp)
                .align(Alignment.CenterHorizontally)
                .background(color = Color(0xFFF05252), shape = RoundedCornerShape(size = 8.dp))
        ) {
            Text(
                text = "Masuk",
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 27.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFFFFFF),
                ),
                modifier = Modifier.padding(vertical = 12.dp, horizontal = 16.dp)
            )
        }

    }
}



@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun LoginPreview() {
    SavorCraftTheme {
        Onboarding()
    }
}