package com.kmp.ui.listelementscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kmp.ui.components.text.KmpText14

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ListElementsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Recuperar Clave",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500,
                        color = Color.Black
                    )
                },
            )
        },
        containerColor = Color.White,
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            KmpText14(
                text = "Hola Mundo"
            )
            KmpText14(
                text = "Hola Mundo"
            )
            KmpText14(
                text = "Hola Mundo"
            )
            KmpText14(
                text = "Hola Mundo"
            )
        }
    }
}
