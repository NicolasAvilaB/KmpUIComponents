//
//  IOSFactoryView.swift
//  iosApp
//
//  Created by Nicolas Rodrigo Avila Biskupovic on 06-07-25.
//

import SwiftUI
import ComposeApp

class IOSNativeViewFactory: NativeViewFactory {
    static var shared = IOSNativeViewFactory()
    func createTextView(text: String) -> UIViewController {
        let view = KmpIOSText14(text: text)
        return UIHostingController(rootView: view)
    }
}
