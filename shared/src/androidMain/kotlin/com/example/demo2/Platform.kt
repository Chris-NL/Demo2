package com.example.demo2


actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"

    actual val systemCurrentTimeMillis: Long = System.currentTimeMillis()

    actual val currentTime: String =
        String.format("%1\$TH:%1\$TM:%1\$TS", System.currentTimeMillis())

}