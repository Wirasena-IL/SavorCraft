package com.example.savorcraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.savorcraft.ui.theme.SavorCraftTheme

class VerifikasiEmail : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TampilanVerifikasi()
        }
    }
}

@Composable
fun TampilanVerifikasi(){
    var c1 by remember { mutableStateOf("") }
    var c2 by remember { mutableStateOf("") }
    var c3 by remember { mutableStateOf("") }
    var c4 by remember { mutableStateOf("") }

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
                text = "Verifikasi Email",
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
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .width(600.dp)
                .height(400.dp)
                .padding(top = 70.dp, start = 50.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.manonthefloor), contentDescription = "",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .height(600.dp)
                    .width(400.dp)
                    )
        }
        Text(
            text = "Silahkan cek email Anda!!! Kami mengirimkan kode verifikasi registrasi",
            modifier = Modifier.padding(top = 30.dp),
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF6B7280),
                textAlign = TextAlign.Center,
            )
        )

    Row ( horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()){
            OutlinedTextField(
                value = c1,
                onValueChange = { c1 = it },
                label = {Text("") },
                modifier = Modifier
                    .padding(10.dp)
                    .width(52.dp)
                    .fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.Black
                )

            )
        OutlinedTextField(
            value = c2,
            onValueChange = { c2 = it },
            label = {Text("") },
            modifier = Modifier
                .padding(10.dp)
                .width(52.dp)
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black
            )

        )
        OutlinedTextField(
            value = c3,
            onValueChange = { c3 = it },
            label = {Text("") },
            modifier = Modifier
                .padding(10.dp)
                .width(52.dp)
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black
            )

        )
        OutlinedTextField(
            value = c4,
            onValueChange = { c4 = it },
            label = {Text("") },
            modifier = Modifier
                .padding(10.dp)
                .width(52.dp)
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black
            )

        )
        }
        Text(
            text = "Belum menerima kode verifikasi",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF1F2A37),
                textAlign = TextAlign.Center
            )
        )
        IconButton(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Kirim ulang?",
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF1C64F2),
                    textAlign = TextAlign.Center,
                )
            )
            
        }
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

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun TampilanVerifikasiPreview() {
    SavorCraftTheme {
        TampilanVerifikasi()
    }
}
