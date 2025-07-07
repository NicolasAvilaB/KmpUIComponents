package com.kmp.ui.components.text

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.UIKitViewController
import com.kmp.ui.components.LocalNativeViewFactory

@Composable
actual fun KmpText14(
    modifier: Modifier,
    text: String
) {
    val factory = LocalNativeViewFactory.current
    UIKitViewController(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp),
        factory = {
            factory.createTextView(text = text)
        }
    )
}