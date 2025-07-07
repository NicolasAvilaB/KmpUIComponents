package com.kmp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kmp.ui.navigation.NavController
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    PreComposeApp {
        KoinContext {
            NavController()
        }
    }
}
