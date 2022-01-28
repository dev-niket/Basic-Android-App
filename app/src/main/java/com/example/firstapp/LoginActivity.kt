package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
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
        when(view.id){

            R.id.btnLogin -> {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()

                //Invoking the RecyclerActivity upon clicking on the login button
                val recyclerIntent = Intent(this, RecyclerActivity::class.java)
                startActivity(recyclerIntent)
            }

            R.id.btnAlarm -> {
                /*
                NOTE:
                This is just a sample intent to another app and does not really have any sense in the context of the app.
                This is just for beginners to understand how can we invoke intents to other applications.
                You can find more about common intents used in Android at the following link
                https://developer.android.com/guide/components/intents-common
                */
                /*
                NOTE 2:
                Make sure that you have added the permission line in the AndroidManifest.xml file
                You can refer the Commit with the message 'Invoking intents to other applications' in order to understand where the permission line needs to be added and what exactly it is.
                You can also find the permission line on the above link which gives the information of all common intents
                 */


                val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                    putExtra(AlarmClock.EXTRA_MESSAGE, "Sample Alarm")
                    putExtra(AlarmClock.EXTRA_HOUR, 12)
                    putExtra(AlarmClock.EXTRA_MINUTES, 0)
                }
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
            }
        }

    }
}