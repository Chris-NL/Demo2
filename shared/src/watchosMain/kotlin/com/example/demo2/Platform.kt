package com.example.demo2

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import platform.Foundation.*
import platform.WatchKit.WKInterfaceDevice

actual class Platform actual constructor() {
    actual val platform: String = WKInterfaceDevice.currentDevice().systemName() + " " + WKInterfaceDevice.currentDevice().systemVersion

    actual val systemCurrentTimeMillis: Long = (NSDate().timeIntervalSince1970 * 1000).toLong()

    actual val currentTime: String =
        NSDateFormatter().apply {
            this.dateFormat = "HH:mm:ss"
        }.stringFromDate(NSDate())

}