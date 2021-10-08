package com.ivamotelo.applicationnotification

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyServiceFirebaseMassage : FirebaseMessagingService() {

       private val tag = "FirebaseMesgService"
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.i(tag, remoteMessage.from.toString())

        if (remoteMessage.notification != null) {
            this.showNotification("1234",
                remoteMessage.notification?.title.toString(),
                remoteMessage.notification?.body.toString())
        }
    }
}