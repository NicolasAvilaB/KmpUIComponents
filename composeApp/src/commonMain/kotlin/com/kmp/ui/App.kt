package com.kmp.ui

import androidx.compose.runtime.Composable
import com.kmp.ui.navigation.NavController
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PreComposeApp {
        NavController()
    }
}
