package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginClickHandler(view: View) {
        when(view.id){
            R.id.btnLoginPage -> {
                startLoginActivity()
            }
            R.id.btnDial -> {
                startDialer()
            }
        }

    }

    private fun startDialer() {
        /*
        NOTE:
        This is just a sample intent to another app and does not really have any sense in the context of the app.
        This is just for beginners to understand how can we invoke intents to other applications.
        You can find more about common intents used in Android at the following link
                https://developer.android.com/guide/components/intents-common
         */

        val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:12345678"))
        startActivity(dialIntent)
    }

    private fun startLoginActivity() {
        var intent: Intent
        intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("check", "Checking Data Transfer")
        startActivity(intent)
    }
}