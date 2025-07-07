package com.kmp.ui.components.text

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
actual fun KmpText14(
    modifier: Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        text = text,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewKmpUiText14Light() {
    Surface {
        KmpText14(
            modifier = Modifier,
            text = "Hello World"
        )
    }
}
