package com.ivamotelo.applicationnotification


import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService

class MyServiceFireBase : FirebaseMessagingService() {

    fun onTokenRefresh(){
    Log.i("**newTokenService", FirebaseMessaging.getInstance().token.toString())
    }
}