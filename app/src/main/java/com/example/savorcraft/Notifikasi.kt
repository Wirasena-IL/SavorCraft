package com.example.savorcraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.savorcraft.ui.theme.SavorCraftTheme

class Notifikasi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TampilanNotifikasi()
        }
    }
}

@Composable
fun TampilanNotifikasi(){
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
                text = "Notifikasi",
                modifier = Modifier
                    .padding(start = 70.dp, top = 20.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 44.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF374151),
                )
            )
            IconButton(
                onClick = { },
                modifier = Modifier.padding(start = 100.dp, top = 10.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Settings",
                    tint = Color.Black
                )
            }
        }
        Row (modifier = Modifier.padding(start = 20.dp,top = 50.dp)){
            Text(
                text = "Selamat Ulang Tahun!",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 30.sp,
                    fontFamily = fontFamily2,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF374151),
                )
            )
            Text(
                text = "Rabu, 19 Mar",
                modifier = Modifier.padding(start = 50.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 21.sp,
                    fontFamily = fontFamily2,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF9CA3AF),
                )
            )

        }
        Text(
            text = "Selamat! Kamu telah menjadi Food recipe lover selama 1 tahun! Berikut adalah ringkasan perjalananmu selama setahun kebelakang.",
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp),
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontFamily = fontFamily2,
                fontWeight = FontWeight(400),
                color = Color(0xFF6B7280),
            )
        )
    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun TampilanNotifPreview() {
    SavorCraftTheme {
        TampilanNotifikasi()
    }
}