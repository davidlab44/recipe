package com.david.epay.ui


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.david.epay.ui.navigation.Navigation
import com.david.epay.ui.theme.EpayTheme
import dagger.hilt.android.AndroidEntryPoint
@ExperimentalFoundationApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val recipeViewModel: RecipeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EpayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val ee = recipeViewModel.onCreate()
                    val recipe = recipeViewModel.recipeModel
                    val dos = 2
                    //Greeting("Android")
                    //MainScreen()
                    Navigation(this)
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current
    val longitude:Double = 23.456
    val latitude:Double = -86.456

    Button(onClick = {
        val intent = Intent(context, MapActivity::class.java)
        intent.putExtra("longitude", longitude)
        intent.putExtra("latitude", longitude)
        context.startActivity(intent)
    }) {
        Text(text = "Show List")
    }
}

// Creating a composable function to
// create two Images and a spacer between them
// Calling this function as content in the above function

/*
EXAMPLE FONTS
@Composable
fun MyContent2(){
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        // Creating a Text
        Text("Hello Geek!", fontSize = 50.sp)
    }
}
*/


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EpayTheme {
        Greeting("Android")
    }
}