package com.kmp.ui.components.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitViewController
import com.kmp.ui.components.LocalNativeViewFactory

@Composable
actual fun KmpText14(
    modifier: Modifier,
    text: String
) {
    val factory = LocalNativeViewFactory.current
    UIKitViewController(
        modifier = modifier,
        factory = {
            factory.createTextView(text = text)
        }
    )
}