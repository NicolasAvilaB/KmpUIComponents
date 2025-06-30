package kmp.ui.components.text

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
    color: Color,
    fontWeight: FontWeight,
    letterSpacing: TextUnit,
    lineHeight: TextUnit,
    textAlign: TextAlign?,
    textDecoration: TextDecoration,
    text: String
) {
    Text(
        text = text,
        fontSize = 14.sp,
        textAlign = textAlign,
        fontWeight = fontWeight,
        letterSpacing = letterSpacing,
        lineHeight = lineHeight,
        textDecoration = textDecoration,
        color = color,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewKmpUiText14Light() {
    Surface {
        KmpText14(
            text = "Hello World"
        )
    }
}
