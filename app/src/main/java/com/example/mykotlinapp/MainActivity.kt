
package com.example.mykotlinapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.titleText)
        val message = findViewById<TextView>(R.id.messageText)
        val button = findViewById<Button>(R.id.welcomeButton)

        title.text = "My Kotlin Project"
        message.text = "Welcome! This is my Android application."

        button.setOnClickListener {
            message.text = "Hello! Thanks for visiting my app."
        }
    }
}
