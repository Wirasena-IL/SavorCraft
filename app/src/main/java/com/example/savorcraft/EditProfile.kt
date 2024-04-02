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
import androidx.compose.material3.TextField
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.savorcraft.ui.theme.SavorCraftTheme

class EditProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TampilanEditProfile()
        }
    }
}

@Composable
fun TampilanEditProfile(){
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )
    val font2 = GoogleFont("dm sans")
    val fontFamily2 = FontFamily(
        Font(googleFont = font2, fontProvider = provider)
    )
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFFFFF)
    ) {

    }
    Column(Modifier.fillMaxWidth()) {
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
                text = "Edit Profile",
                modifier = Modifier
                    .padding(start = 70.dp, top = 20.dp, bottom = 30.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 44.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF374151),
                )
            )
        }
        Image(
            painter = painterResource(id = R.drawable.editpf),
            modifier = Modifier
                .width(158.dp)
                .height(158.dp)
                .align(Alignment.CenterHorizontally),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = "Tambah Foto",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontFamily = fontFamily2,
                fontWeight = FontWeight(500),
                color = Color(0xFFE02424),
                textAlign = TextAlign.Center
            )
        )
        Text(
            text = "Nama Lengkap",
            modifier = Modifier
                .padding(start = 20.dp, top = 50.dp),
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontFamily = fontFamily2,
                fontWeight = FontWeight(400),
                color = Color(0xFF6B7280),
            )
        )

        TextField(
            value = nama,
            onValueChange = { nama = it },
            label = {Text("Al-Kahfi Smith",style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontFamily = fontFamily2,
                fontWeight = FontWeight(600),
                color = Color(0xFF374151),

                )) },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black
            )

        )
        Text(
            text = "Email",
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp),
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontFamily = fontFamily2,
                fontWeight = FontWeight(400),
                color = Color(0xFF6B7280),
            )
        )
        TextField(
            value = nama,
            onValueChange = { nama = it },
            label = {Text("alkahfismith@gmail.com",style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontFamily = fontFamily2,
                fontWeight = FontWeight(400),
                color = Color(0xFF1F2A37),

                )) },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
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
                    text = "Simpan",
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
fun TampilanEditProfilePreview() {
    SavorCraftTheme {
        TampilanEditProfile()
    }
}