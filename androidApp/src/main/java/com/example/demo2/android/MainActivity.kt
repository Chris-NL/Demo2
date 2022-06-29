package com.example.demo2.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.example.demo2.*
import com.example.demo2.android.databinding.ActivityMainBinding

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var automaticUpdates: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = greet()

        binding.button.setOnClickListener {
        }

        startAutomaticUpdates()
    }

    fun startAutomaticUpdates() {
        automaticUpdates = lifecycleScope.launch(Dispatchers.Main) {
            val automaticUpdates = true
            while (automaticUpdates) {
                //Log.d("AutomaticUpdates", "Updating...")
                delay(250)
            }
        }
    }

}
