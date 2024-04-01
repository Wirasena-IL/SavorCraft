package com.example.savorcraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.savorcraft.ui.theme.SavorCraftTheme

class LupaPw : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TampilanLupaPw()
        }
    }
}

@Composable
fun TampilanLupaPw(){
    var email by remember { mutableStateOf("") }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFFFFF)
    ) {

    }
    Column {
        Row {
            IconButton(onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.left), contentDescription ="",
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                        .background(color = Color(0xFFFFFFFF))
                        .padding(start = 20.dp, top = 20.dp))

            }
            Text(
                text = "Lupa Password",
                modifier = Modifier
                    .padding(start = 70.dp, top = 20.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 44.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF374151),
                )
            )
        }
        Text(
            text = "Silahkan masukkan kembali email yang sudah Anda daftarkan!!",
            modifier = Modifier.padding(top = 30.dp),
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF6B7280),
                textAlign = TextAlign.Center,
            )
        )
        OutlinedTextField(
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.message35), contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier
                        .width(24.dp)
                        .height(22.dp))
            },
            value = email,
            onValueChange = { email = it },
            label = {Text("contohemail@gmail.com") },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 40.dp)
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black
            )

        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom){
            IconButton(
                onClick = { /*TODO*/ } ,
                modifier = Modifier
                    .padding(top = 30.dp)
                    .width(320.dp)
                    .height(51.dp)
                    .align(Alignment.CenterHorizontally)
                    .background(color = Color(0xFFF05252), shape = RoundedCornerShape(size = 8.dp))
            ) {
                Text(
                    text = "Konfirmasi",
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

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun TampilanLupaPwPreview() {
    SavorCraftTheme {
        TampilanLupaPw()
    }
}