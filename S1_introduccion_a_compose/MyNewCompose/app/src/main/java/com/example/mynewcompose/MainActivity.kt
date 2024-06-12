package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GranText1("Test")
                }
            }
        }
    }
}

@Preview(
    name = "GranText1", heightDp = 50, widthDp = 200, showBackground = true,
    showSystemUi = true,
    apiLevel = 29
)

@Composable
fun TestGranText1() {
    GranText1(name = "Test")
}

@Composable
fun GranText1(name: String) {
    Text(
        text = "Mi nombre es James Arias y tu $name", modifier = Modifier
            .height(50.dp)
            .width(300.dp)
            .padding(8.dp)
            .fillMaxSize()
    )
}
