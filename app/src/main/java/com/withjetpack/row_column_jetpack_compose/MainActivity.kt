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
                    RowExample()
                    ColumnExample()
                }
            }
        }
    }
}

@Composable
fun ColumnExample() {

    val modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .height(200.dp)
        .background(Color.LightGray)

    Column(modifier = modifier, verticalArrangement = Arrangement.Top) {
        ColumnTextsAllignment()
    }

    Column(modifier = modifier, verticalArrangement = Arrangement.Bottom) {
        ColumnTextsAllignment()
    }

    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        ColumnTextsAllignment()
    }

    Column(modifier = modifier, verticalArrangement = Arrangement.SpaceEvenly) {
        ColumnTextsAllignment()
    }

    Column(modifier = modifier, verticalArrangement = Arrangement.SpaceAround) {
        ColumnTextsAllignment()
    }

    Column(modifier = modifier, verticalArrangement = Arrangement.SpaceBetween) {
        ColumnTextsAllignment()
    }
}

@Composable
fun ColumnTextsAllignment() {

    Text(
        text = "Column1", modifier = Modifier
            .background(Color(0xFF8BC34A))
            .padding(4.dp)
    )

    Spacer(modifier = Modifier.padding(all = 10.dp))

    Text(
        text = "Column2", modifier = Modifier
            .background(Color(0xFF9CCC65))
            .padding(4.dp)
    )

    Spacer(modifier = Modifier.padding(all = 10.dp))

    Text(
        text = "Column3", modifier = Modifier
            .background(Color(0xFFAED581))
            .padding(4.dp)
    )
}

@Composable
fun RowExample() {

    Row(modifier = Modifier.fillMaxWidth().padding(all = 10.dp), horizontalArrangement = Arrangement.Start) {
        RowTextsAllignment()
    }

    Row(modifier = Modifier.fillMaxWidth().padding(all = 10.dp), horizontalArrangement = Arrangement.End) {
        RowTextsAllignment()
    }

    Row(modifier = Modifier.fillMaxWidth().padding(all = 10.dp), horizontalArrangement = Arrangement.Center) {
        RowTextsAllignment()
    }

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        RowTextsAllignment()
    }

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        RowTextsAllignment()
    }

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        RowTextsAllignment()
    }

}


@Composable
fun RowTextsAllignment() {
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