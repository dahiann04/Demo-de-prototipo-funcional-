import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import com.example.dely.R

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dely.ui.buttons.CircularImage
import com.example.dely.ui.buttons.InputText
import com.example.dely.ui.theme.DelyTheme

@Composable
fun LoginScreen() {
    var usuario by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painterResource(R.drawable.iconodely),
            contentDescription = "Dely",
            modifier = Modifier
                .padding(0.dp, 0.dp, 0.dp, 0.dp)
                .width(440.dp))

        InputText(
            value = usuario,
            onValueChange = { usuario = it },
            text = "Usuario",
        )
        InputText(
            value = password,
            onValueChange = { password = it },
            text = "Contraseña",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    DelyTheme {
        LoginScreen()
    }
}
