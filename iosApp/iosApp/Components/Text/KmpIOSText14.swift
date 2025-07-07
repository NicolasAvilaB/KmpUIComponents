//
//  KmpiOSText14.swift
//  iosApp
//
//  Created by Nicolas Rodrigo Avila Biskupovic on 30-06-25.
//
import SwiftUI
import ComposeApp

struct KmpIOSText14: View {
    let text: String
    /*let color: Color
    let fontWeight: Font.Weight
    let letterSpacing: CGFloat
    let lineHeight: CGFloat
    let textAlign: TextAlignment
    let textDecoration: TextDecorationOption*/

    var body: some View {
        Text(text)
            .font(.system(size: 14))
            /*.foregroundColor(color)
            .kerning(letterSpacing)
            .lineSpacing(lineHeight)
            .multilineTextAlignment(textAlign)
            .underline(textDecoration == .underline)*/
    }
}

enum TextDecorationOption {
    case none, underline
}

#Preview {
    KmpIOSText14(
        text: "Hello World!",
        /*color: .blue,
        fontWeight: .regular,
        letterSpacing: 0,
        lineHeight: 0,
        textAlign: .leading,
        textDecoration: .underline*/
    )
}
