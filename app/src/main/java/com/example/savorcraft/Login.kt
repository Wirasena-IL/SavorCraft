package com.example.savorcraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.savorcraft.ui.theme.SavorCraftTheme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TampilanLogin()
        }
    }
}

@Composable
fun TampilanLogin(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var checkedState by remember { mutableStateOf(false) }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFFFFF)
    ) {

    }
    Column {
        Text(
            text = "Masuk",
            style = TextStyle(
                fontSize = 40.sp,
                lineHeight = 44.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF374151),
            ),
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp)
        )

        Text(
            text = "Selamat datang kembali! Masuk untuk mengakses pengalaman personal Anda",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF6B7280),
            ),
            modifier = Modifier.padding(start = 20.dp, top = 26.dp)
        )

        Text(
            text = "Email",
            modifier = Modifier.padding(start = 20.dp, top = 50.dp),
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF1F2A37),
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
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black
            )

        )

        Text(
            text = "Password",
            modifier = Modifier.padding(start = 20.dp, top = 16.dp),
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF1F2A37),
            )
        )

        OutlinedTextField(
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.lock1), contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier
                        .width(24.dp)
                        .height(22.dp))
            },
            trailingIcon = {
                Icon(painter = painterResource(id = R.drawable.hide1), contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier
                        .width(24.dp)
                        .height(22.dp))
            },
            value = password,
            onValueChange = { password = it },
            label = {Text("********") },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black
            )
        )

        Row(modifier = Modifier
            .fillMaxWidth(),){
            Checkbox(
                checked = checkedState,
                modifier = Modifier.padding(start = 8.dp, top = 22.dp),
                onCheckedChange = { isChecked ->
                    checkedState = isChecked
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Ingat saya",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF1F2A37),
                ),modifier = Modifier.padding(top = 33.dp))

            Text(
                text = "Lupa password?",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF1C64F2),
                    textAlign = TextAlign.Right,
                ),modifier = Modifier.padding(top = 33.dp, start = 100.dp)

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
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Divider(
                Modifier
                    .padding(start = 20.dp, end = 5.dp)
                    .width(140.dp)
                    .height(1.dp)
                    .background(color = Color(0xFFD1D5DB)))
            Text(
                text = "Atau",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 21.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF9CA3AF),
                )
            )
            Divider(
                Modifier
                    .padding(start = 5.dp, end = 25.dp)
                    .width(160.dp)
                    .height(1.dp)
                    .background(color = Color(0xFFD1D5DB)))
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                IconButton(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .padding(1.dp)
                        .width(60.dp)
                        .height(60.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(50.dp)
                            .height(51.dp)
                    )
                }

                IconButton(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .padding(1.dp)
                        .width(60.dp)
                        .height(60.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fb),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(50.dp)
                            .height(51.dp)
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Belum punya akun?",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF6B7280),
                    textAlign = TextAlign.Center,
                )
            )
            ClickableText(text = AnnotatedString("Daftar"), onClick = {},
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF1C64F2),
                    textAlign = TextAlign.Center,))
        }

    }


}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun TampilanLoginPreview() {
    SavorCraftTheme {
        TampilanLogin()
    }
}