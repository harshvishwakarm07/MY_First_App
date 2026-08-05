package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = arrayOf("Apple", "Banana", "Orange", "Grapes", "Mango", "Pineapple", "Strawberry")
        val listView = findViewById<ListView>(R.id.fruitListView)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedFruit = fruits[position]
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("FRUIT_NAME", selectedFruit)
            startActivity(intent)
        }
    }
}