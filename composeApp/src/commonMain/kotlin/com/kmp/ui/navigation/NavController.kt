package com.kmp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import com.kmp.ui.listelementscreen.ListElementsScreen

@Composable
fun NavController(){
    val navigator = rememberNavigator()
    val navGo = remember(navigator) { NavGo(navigator) }
    val startDestination = NavRoutes.ListElementsScreen.route

    NavHost(
        navigator = navigator,
        initialRoute = startDestination
    ) {
        scene(
            route = startDestination,
            content = {
                ListElementsScreen()
            }
        )
    }
}

sealed class NavRoutes(var route: String) {
    object ListElementsScreen : NavRoutes("/listElementsScreen")
}
