package net.runner.resonate

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import net.runner.goodvib.GoodVib
import net.runner.resonate.ui.theme.ResonateTheme


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ResonateTheme {
                val context = LocalContext.current

                Button(
                    onClick = {
                        GoodVib.vib(context,100)
                    }
                ) {
                    Text("Click Me")
                }

            }
        }
    }
}
