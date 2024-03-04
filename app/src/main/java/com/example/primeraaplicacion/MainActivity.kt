package com.example.primeraaplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primeraaplicacion.ui.theme.PrimeraAplicacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeraAplicacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("android")
                }
            }
        }
    }
}
/*
* para trabajar con conpose toca colocarle la anotacion
* @composable antes
* */

/*
*   Observa la anotación @Composable que se encuentra sobre ella. Una función de
*   componibilidad toma alguna entrada y genera lo que se muestra en la pantalla.
*
*   Los nombres de las funciones @Composable llevan mayúscula.
*   Antes de la función, se agrega la anotación @Composable.
*   Las funciones @Composable no pueden mostrar nada.*
*
*/
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    /**
     *  Si deseas establecer un color de fondo diferente para la presentación,
     *  deberás envolver el texto en una Surface. Una Surface es un contenedor que representa
     *  una sección de la IU en la que puedes modificar el aspecto, como el borde o el color de
     *  fondo.
     *
     *  Para rodear el texto con una Surface, destaca la línea de texto, presiona
     *  (Alt+Enter en Windows o Option+Enter en Mac) y, luego, selecciona Surround with widget.
     *
     *  Selecciona Surround with Container.
     *
     *  Borra Box y escribe Surface() en su lugar.
     *
     *  para agreagrle padin importamos
     *
     *  import androidx.compose.ui.unit.dp
     *  import androidx.compose.foundation.layout.padding
     *
     *  y modifier = Modifier.padding(24.dp)
     * */
    Surface (color = Color.Blue){
        Text(
            text = "Hola mi nombre es $name!",
            modifier = Modifier.padding(24.dp)
        )
    }
}
/*  la anotación @Preview toma un parámetro llamado showBackground. Si estableces showBackground
    como verdadero, se agregará un fondo a la vista previa de tu app.

    Como Android Studio usa un tema claro de forma predeterminada para el editor, puede resultar
    difícil ver la diferencia entre showBackground = verdadero y showBackground = falso.
    Sin embargo, así se ve la diferencia con un tema oscuro.
 */

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeraAplicacionTheme {
        Greeting("Erick")
    }
}