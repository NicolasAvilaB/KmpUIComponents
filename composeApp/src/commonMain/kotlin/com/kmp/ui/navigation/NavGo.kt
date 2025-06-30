package com.kmp.ui.navigation

import moe.tlaster.precompose.navigation.Navigator

class NavGo(navigator: Navigator) {
    val startDestination: () -> Unit = {
        navigator.navigate(NavRoutes.ListElementsScreen.route)
    }

    val popBackStack: () -> Unit = {
        navigator.popBackStack()
    }
}