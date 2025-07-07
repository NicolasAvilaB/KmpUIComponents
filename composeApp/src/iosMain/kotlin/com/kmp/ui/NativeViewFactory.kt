package com.kmp.ui

import platform.UIKit.UIViewController

interface NativeViewFactory {
    fun createTextView(
        text: String
    ):UIViewController
}