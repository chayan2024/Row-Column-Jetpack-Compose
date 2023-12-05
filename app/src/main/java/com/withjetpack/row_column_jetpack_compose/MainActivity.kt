package com.withjetpack.row_column_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.withjetpack.row_column_jetpack_compose.ui.theme.RowColumnJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowColumnJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RowExample()                }
            }
        }
    }
}

@Composable
fun RowExample() {

    Row(modifier = Modifier.fillMaxWidth().padding(all = 10.dp), horizontalArrangement = Arrangement.Start) {
        RowTexts()
    }

    Row(modifier = Modifier.fillMaxWidth().padding(all = 10.dp), horizontalArrangement = Arrangement.End) {
        RowTexts()
    }

    Row(modifier = Modifier.fillMaxWidth().padding(all = 10.dp), horizontalArrangement = Arrangement.Center) {
        RowTexts()
    }

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        RowTexts()
    }

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        RowTexts()
    }

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        RowTexts()
    }

}


@Composable
fun RowTexts() {
    Text(
        text = "Row1", modifier = Modifier
            .background(Color(0xFFFF9800))
            .padding(10.dp)
    )
    Spacer(modifier = Modifier.padding(all = 10.dp))
    Text(
        text = "Row2", modifier = Modifier
            .background(Color(0xFFFFA726))
            .padding(10.dp)
    )
    Spacer(modifier = Modifier.padding(all = 10.dp))

    Text(
        text = "Row3", modifier = Modifier
            .background(Color(0xFFFFB74D))
            .padding(10.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RowColumnJetpackComposeTheme {

    }
}