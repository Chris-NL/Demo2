//
//  ContentView.swift
//  WatchDemo2 WatchKit Extension
//
//  Created by Bash on 06/12/2021.
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
    }
}
