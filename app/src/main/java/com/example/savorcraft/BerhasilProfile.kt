package com.example.savorcraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.platform.LocalContext
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

class BerhasilProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BerhasilPf()
        }
    }
}

@Composable
fun BerhasilPf() {
    val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )
    val font2 = GoogleFont("dm sans")
    val fontFamily2 = FontFamily(
        Font(googleFont = font2, fontProvider = provider)
    )
    val context = LocalContext.current
    val startActivity = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { _ ->
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFFFFF)
    ) {

    }
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.joyful),
            contentDescription = "Login Image",
            modifier = Modifier
                .size(width = 520.dp, height = 520.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 70.dp)

        )
        Text(
            text = "Yeah Berhasil Diubah !!",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 30.sp,
                fontFamily = fontFamily2,
                fontWeight = FontWeight(600),
                color = Color(0xFF374151),

                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .padding(top = 30.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            modifier = Modifier
                .padding(top = 26.dp, start = 20.dp, end = 20.dp)
                .align(Alignment.CenterHorizontally),
            text = "Selamat Anda berhasil mengubah biodata profil kamu",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontFamily = fontFamily2,
                fontWeight = FontWeight(500),
                color = Color(0xFF6B7280),
                textAlign = TextAlign.Center,
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
                    text = "Lanjutkan",
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
fun BerhasilPfPreview() {
    SavorCraftTheme {
        BerhasilPf()
    }
}