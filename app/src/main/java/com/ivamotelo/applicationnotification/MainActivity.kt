package com.ivamotelo.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {

    lateinit var btn_send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_send = findViewById(R.id.btn_send_message)
        btn_send.setOnClickListener{
            /**
             * Local Notification
             */
            this.showNotification("1234", "BootCamp", "Curso Android")
        }
        Log.i("**newToken", FirebaseMessaging.getInstance().token.toString())
    }
}