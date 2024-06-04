package ir.m3.rahmani.studywithme

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import androidx.core.app.NotificationCompat
import ir.m3.rahmani.studywithme.home.HomeActivity

class PomodoroTimerService : Service() {

    companion object {
        const val EXTRA_TIME = "EXTRA_TIME"
        const val ACTION_UPDATE = "ACTION_UPDATE"
        const val ONE_SECOND_LONG = 1000L
        const val CHANNEL_ID = "TIMER_SERVICE_ID"
    }

    override fun onCreate() {
        super.onCreate()

        createNotificationChannel()
        startForeground(1, getNotification())
    }

    private fun sendTimeUpdate() {
        val intent = Intent(ACTION_UPDATE)
        sendBroadcast(intent)
    }

    private fun getNotification(): Notification {
        val notificationIntent = Intent(this, HomeActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            this, 0, notificationIntent, PendingIntent.FLAG_IMMUTABLE
        )

        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle(getString(R.string.service_notification_title))
            .setContentText(getString(R.string.service_notification_content))
            .setSmallIcon(R.drawable.pomo)
            .setContentIntent(pendingIntent)
            .build()
    }


    private fun createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                CHANNEL_ID,
                "Timer Service Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(serviceChannel)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}