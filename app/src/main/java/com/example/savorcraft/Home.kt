package com.example.savorcraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.LocalOverscrollConfiguration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import com.example.savorcraft.ui.navigation.Screen
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.savorcraft.ui.navigation.NavigationItem
import com.example.savorcraft.ui.theme.SavorCraftTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TampilanHome()
        }
    }
}
val list = listOf(
    R.drawable.home1,
    R.drawable.home2,
    R.drawable.home3
)
val list2 = listOf(
    R.drawable.rekomen1,
    R.drawable.home2,
    R.drawable.home3
)

@OptIn(ExperimentalPagerApi::class, ExperimentalFoundationApi::class)
@Composable
fun TampilanHome() {
    val pagerState = rememberPagerState()
    val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )
    val fontName = GoogleFont("Spirax")
    val fontFamily = FontFamily(
        Font(googleFont = fontName, fontProvider = provider)
    )

    val font2 = GoogleFont("dm sans")
    val fontFamily2 = FontFamily(
        Font(googleFont = font2, fontProvider = provider)
    )

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFFFFF)
    ) {
        Column {
            Row(modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth()) {
                Text(
                    text = "SavorCraft",
                    modifier = Modifier.padding(start = 20.dp, top = 10.dp),
                    style = TextStyle(
                        fontSize = 24.sp,
                        lineHeight = 30.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFE02424),
                    )
                )
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 150.dp)) {
                    Image(painter = painterResource(id = R.drawable.notif), contentDescription = "",
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                    )
                }

            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(top = 20.dp)) {
                CompositionLocalProvider(LocalOverscrollConfiguration provides null) {
                    HorizontalPager(
                        modifier = Modifier.height(150.dp),
                        count = list.size,
                        itemSpacing = 15.dp,
                        contentPadding = PaddingValues(horizontal = 40.dp),
                        state = pagerState
                    ) { page ->
                        val currentItem = list.getOrNull(page % list.size)
                        currentItem?.let { imageResId ->
                            Banner(imageResourceId = imageResId)
                        }
                    }
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically,modifier = Modifier
                .fillMaxWidth()) {
                Text(
                    text = "Rekomendasi",
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 30.sp,
                        fontFamily = fontFamily2,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF374151),
                    ),
                    modifier = Modifier.padding(start = 20.dp)
                )
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically,modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Semua",
                            modifier = Modifier.padding(start = 110.dp, end = 20.dp),
                            style = TextStyle(
                                fontSize = 20.sp,
                                lineHeight = 24.sp,
                                fontFamily = fontFamily2,
                                fontWeight = FontWeight(400),
                                color = Color(0xFFF05252),
                            )
                        )
                        Image(
                            painter = painterResource(id = R.drawable.right2),
                            contentDescription = "image description",
                            contentScale = ContentScale.FillBounds, modifier = Modifier
                                .width(30.dp)
                                .height(10.dp)
                        )
                    }
                    
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(131.dp)
                    .background(Color.White)
                    .padding(top = 20.dp)
            ) {
                CompositionLocalProvider(LocalOverscrollConfiguration provides null) {
                    HorizontalPager(
                        modifier = Modifier.fillMaxWidth(),
                        count = list2.size,
                        itemSpacing = 15.dp,
                        contentPadding = PaddingValues(horizontal = 40.dp),
                        state = pagerState
                    ) { page ->
                        Column(
                            modifier = Modifier
                                .wrapContentSize() // Wrap content size to avoid taking the full width
                                .padding(end = 15.dp) // Adjust spacing between items
                        ) {
                            val currentItem = list2.getOrNull(page % list.size)
                            currentItem?.let { imageResId ->
                                Rekomendasi(ImageRsc = imageResId)
                            }
                        }
                    }
                }
            }

        }
    }
}



@Composable
fun Rekomendasi(ImageRsc: Int){
    Box (
        modifier = Modifier.width(150.dp)
            .height(204.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 10.dp))
            .padding(bottom = 12.dp)
            .border(width = 1.dp, color = Color(0xFFE5E7EB), shape = RoundedCornerShape(size = 10.dp))
    ){
        Image(
            painter = painterResource(id = ImageRsc),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(8.dp)),
            contentScale = ContentScale.FillBounds
        )

    }
}


@Composable
fun Banner(imageResourceId: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan, shape = RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = imageResourceId),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(8.dp)),
            contentScale = ContentScale.FillBounds
        )
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun TampilanHomePreview() {
    SavorCraftTheme {
        TampilanHome()
    }
}