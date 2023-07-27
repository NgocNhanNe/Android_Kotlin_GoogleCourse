package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}
@Composable
fun BusinessCardApp(){
    val logo = painterResource(R.drawable.logo_android)
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(0xFF282B29)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(painter = logo, contentDescription = null)

        Text(
            text = stringResource(R.string.full_name),
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = stringResource(R.string.title),
            color = Color(0xFF3ddc84)
        )
    }


    Column(
        Modifier
            .fillMaxWidth()
            .padding(top = 500.dp)
            .padding(bottom = 70.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)) {
            Icon(
                painter = painterResource(R.drawable.ic_baseline_local_phone_24),
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84)
            )
            Text(
                text = stringResource(R.string.phone),
                modifier = Modifier.padding(start = 25.dp),
                color = Color.White
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)) {
            Icon(
                painter = painterResource(R.drawable.ic_baseline_share_24),
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84)
            )
            Text(
                text = stringResource(R.string.share),
                modifier = Modifier.padding(start = 25.dp),
                color = Color.White
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)) {
            Icon(
                painter = painterResource(R.drawable.ic_baseline_email_24),
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF3ddc84)
            )
            Text(
                text = stringResource(R.string.email),
                modifier = Modifier.padding(start = 25.dp),
                color = Color.White
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}