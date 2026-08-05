package com.example.intent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val fruitName = intent.getStringExtra("FRUIT_NAME") ?: "Unknown"
        val messageTextView = findViewById<TextView>(R.id.detailMessage)

        messageTextView.text = "You clicked on the $fruitName"
    }
}