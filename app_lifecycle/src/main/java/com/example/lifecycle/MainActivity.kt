package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "LifecycleEvents"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showLogAndToast("onCreate called")
    }

    override fun onStart() {
        super.onStart()
        showLogAndToast("onStart called")
    }

    override fun onResume() {
        super.onResume()
        showLogAndToast("onResume called")
    }

    override fun onPause() {
        super.onPause()
        showLogAndToast("onPause called")
    }

    override fun onStop() {
        super.onStop()
        showLogAndToast("onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showLogAndToast("onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        showLogAndToast("onRestart called")
    }

    private fun showLogAndToast(message: String) {
        Log.d(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}