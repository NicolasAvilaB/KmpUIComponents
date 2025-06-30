package com.kmp.ui.components

import androidx.compose.ui.window.ComposeUIViewController
import com.kmp.ui.App
import com.kmp.ui.di.AppModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController { App() }

fun initKoin(){
    startKoin {
        modules(AppModule())
    }.koin
}
