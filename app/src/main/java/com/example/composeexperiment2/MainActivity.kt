package com.example.composeexperiment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexperiment2.ui.theme.ComposeExperiment2Theme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExperiment2Theme {
                NewsStory()
            }

        }
    }
}



@Composable
fun NewsStory() {

    val image = imageResource(R.drawable.header)
//    val yellow200 = Color(0xffffeb46)
//    val blue200 = Color(0xff91a4fc)
//// ...
//
//    val DarkColors = darkColors(
//        primary = yellow200,
//        secondary = blue200,
//        // ...
//    )
//    val LightColors = lightColors(
//        primary = Yellow500,
//        primaryVariant = Yellow400,
//        secondary = Blue700,
//        // ...
//    )
    ComposeExperiment2Theme {
       val typography = MaterialTheme.typography
        Column(modifier = Modifier
            .padding(16.dp)
            .background(MaterialTheme.colors.secondary)) {
            val imageModifier = Modifier
                .preferredHeight(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp))

            Image(image, imageModifier, contentScale = ContentScale.Crop)
            Spacer(Modifier.preferredHeight(16.dp))

            Text(
                "A day wandering through the sandhills " +
                        "in Shark Fin Cove, and a few of the " +
                        "sights I saw",
                style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis)
            Text("Davenport, California",
                style = typography.body2,
                color = MaterialTheme.colors.primary)
            Text("December 2018",
                style = typography.body2,
                color = MaterialTheme.colors.primary)
        }
    }

}

@Preview
@Composable
fun DefaultPreview() {
    ComposeExperiment2Theme {
        NewsStory()
    }
}
