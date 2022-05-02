package com.example.homework1

import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        Log.d("TAG1", remoteMessage.toString())
        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, Intent(), PendingIntent.FLAG_IMMUTABLE)

        val builder = NotificationCompat.Builder(this, MainActivity.CHANNEL_ID)
            .setContentTitle(remoteMessage.notification?.title)
            .setSmallIcon(R.drawable.ic_message)
            .setContentText(remoteMessage.notification?.body)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)

        val manager = NotificationManagerCompat.from(this)
        manager.notify(42, builder.build())
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
    }
}