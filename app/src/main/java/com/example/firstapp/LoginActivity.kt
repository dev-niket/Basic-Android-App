package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var tvLogin = findViewById<TextView>(R.id.textView)
        tvLogin.text = intent.getStringExtra("check")
    }

    fun clickHandler(view: View) {
        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
    }
}