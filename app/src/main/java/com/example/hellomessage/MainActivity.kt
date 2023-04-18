package com.example.hellomessage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hellomessage.ui.theme.HelloMessageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloMessageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Greeting(name = "Keshav Raj Kashyap", age = "24")
                }
            }
        }
    }

}

@Composable
fun Greeting(name: String, age: String, modifier: Modifier = Modifier) {
Column() {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloMessageTheme {
        Greeting(name = "keshav Raj kashyap", age = "24" )
    }
}