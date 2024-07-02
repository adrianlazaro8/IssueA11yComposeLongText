package com.adlagar.a11ytestlongtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adlagar.a11ytestlongtext.ui.theme.A11yTestLongTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            A11yTestLongTextTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                    topBar = {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(140.dp)
                        ) {
                            Text(text = "Header")
                        }
                    }) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(
                            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam lobortis, ante nec faucibus ullamcorper, quam magna pretium odio, et feugiat neque massa eu ipsum. Sed sed mi ut purus euismod sollicitudin nec ut nibh. Donec posuere odio fringilla ipsum congue auctor. Nam id facilisis urna, non vestibulum risus. Suspendisse accumsan est eget dui vehicula, quis imperdiet sapien laoreet. Praesent venenatis pulvinar tortor, sit amet ultrices ligula sodales vitae. Pellentesque at ipsum ligula. Vestibulum ac cursus mauris, eget porttitor risus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aliquam sit amet rhoncus mi. Maecenas lacus velit, suscipit porttitor accumsan ut, volutpat at orci. Vestibulum sit amet quam laoreet velit iaculis elementum.\n" +
                                    "\n" +
                                    "Phasellus pellentesque semper arcu et dignissim. Suspendisse euismod sit amet turpis vitae hendrerit. Ut eget blandit velit. Sed pulvinar nisi metus, sed pellentesque leo eleifend ut. Nullam rutrum quam sem. Proin accumsan blandit urna, quis tincidunt enim malesuada et. Nam efficitur metus orci, vitae facilisis nunc eleifend eget. Duis sollicitudin commodo ante vel sodales. Vivamus aliquam, dui eu molestie mollis, tellus quam vulputate dui, at auctor leo ipsum sagittis erat. Quisque sit amet vulputate dui.\n" +
                                    "\n" +
                                    "Proin vel est eu urna fringilla commodo. Nunc vitae pulvinar ex. Morbi sapien augue, placerat a elit et, laoreet consequat elit. Sed tristique commodo velit id tempor. Mauris commodo nulla ex, aliquet posuere arcu fermentum sed. Aliquam aliquam ante nisl, ac porta orci sodales vitae. Nullam mattis felis augue, vitae lacinia justo euismod et. Vestibulum mi quam, euismod sed tristique non, rhoncus nec nunc. Duis id turpis id felis sagittis tristique ut a mauris. Vestibulum eu libero nec diam consectetur volutpat vitae id orci. Nam vel fringilla felis, vel venenatis odio. Nulla nec ornare augue. Interdum et malesuada fames ac ante ipsum primis in faucibus.\n" +
                                    "\n" +
                                    "Quisque facilisis, felis ac molestie faucibus, nisi odio faucibus nunc, eget convallis risus dui consequat dui. Suspendisse varius urna eu auctor sodales. Fusce ut ipsum semper, rutrum ipsum non, faucibus elit. Ut non ex eget lacus viverra porta a id mi. Nunc porttitor sapien nisi, vel auctor nisi scelerisque a. Fusce diam tortor, vulputate porttitor ipsum ut, consectetur porttitor nibh. Proin luctus lacinia eros ac condimentum. Sed lectus lorem, hendrerit ut eleifend sed, ornare et ligula. Aliquam in lectus risus. Sed in ullamcorper metus, vitae vehicula arcu. Ut in elit eu odio blandit posuere. Morbi a viverra nunc. Vestibulum sagittis, magna in ullamcorper dictum, nulla neque scelerisque mauris, et fermentum nunc nunc gravida nibh. Quisque ac tortor efficitur ante sodales vehicula. Vivamus aliquam ipsum vitae consectetur viverra. Nam eget diam mollis, congue arcu ut, vulputate eros.\n" +
                                    "\n" +
                                    "Donec tincidunt elit quam, cursus ullamcorper est accumsan non. Nam ac dapibus metus. Vivamus eget ex sit amet massa euismod porttitor in a mi. Ut euismod, ligula ut ultrices luctus, magna nisl aliquam libero, id blandit sapien lorem sit amet dui. Morbi vel dictum sapien. Pellentesque blandit mauris condimentum odio scelerisque tristique. Maecenas leo odio, blandit eget feugiat nec, tempus at felis. Aliquam ut lacus rhoncus, pretium felis eu, pulvinar mi. Nunc eros erat, mattis pretium nisi et, ultricies elementum urna. Proin eu augue quis augue eleifend dictum quis et quam. Quisque ut lacinia orci, et ullamcorper risus. Donec eleifend, nisi a porttitor fringilla, est nisl scelerisque dolor, fermentum maximus magna orci in urna. Curabitur sodales sollicitudin scelerisque. Vivamus eget neque neque. Pellentesque rhoncus, magna et aliquam tincidunt, est lorem ultrices lacus, a elementum tortor augue non nisi. Pellentesque non vulputate erat."
                        )

                        Spacer(modifier = Modifier.height(70.dp))

                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            onClick = {}
                        ) {
                            Text(text = "Button")
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    A11yTestLongTextTheme {
        Greeting("Android")
    }
}