package com.kmp.ui.components

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.window.ComposeUIViewController
import com.kmp.ui.App
import com.kmp.ui.NativeViewFactory
import com.kmp.ui.di.AppModule
import org.koin.core.context.startKoin

val LocalNativeViewFactory = staticCompositionLocalOf<NativeViewFactory> {
    error("Ninguna vista Factory proveída")
}

fun MainViewController(
    nativeViewFactory: NativeViewFactory
) = ComposeUIViewController {
    CompositionLocalProvider(
        LocalNativeViewFactory provides nativeViewFactory
    ) {
        App()
    }
}

fun initKoin(){
    startKoin {
        modules(AppModule())
    }.koin
}
