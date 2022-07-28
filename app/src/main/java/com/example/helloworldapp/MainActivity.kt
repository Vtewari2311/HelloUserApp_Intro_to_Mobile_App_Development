package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show the layout file: activity_main
        setContentView(R.layout.activity_main)
        // Display customized text to show "Hello from {name}'

        // User can tap a button and change color
        // 1. Add a button to layout


        // Get a reference to button
        // 2. Set up logic to check when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handles button tap
            // 2. Change color of text
            Log.i("Change Text Color", "Tapped on button")
            // 2. Change color of text
                // 1. Get a reference to the text view
                // 2. Set a color of the text view
                // Deprecated method but still usable
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red))

        }
    }
}