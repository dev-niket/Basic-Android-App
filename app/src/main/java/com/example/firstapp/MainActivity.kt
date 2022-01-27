package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginClickHandler(view: View) {
        var intent: Intent
        intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("check", "Checking Data Transfer")
        startActivity(intent)
    }
}