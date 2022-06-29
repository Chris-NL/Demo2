//
//  ContentView.swift
//  Demo2
//
//  Created by Bash on 07/10/2021.
//  Copyright © 2021 Bash. All rights reserved.
//

import SwiftUI
import shared

struct ContentView: View {
    let greet = Greeting().greeting()

    var body: some View {
        Text(greet)
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
        ContentView()
            .preferredColorScheme(.dark)
            .previewInterfaceOrientation(.landscapeLeft)
    }
}
