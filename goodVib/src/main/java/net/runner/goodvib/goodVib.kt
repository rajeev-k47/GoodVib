package net.runner.goodvib

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.annotation.RequiresApi


object GoodVib {
    fun cancelVibration(context: Context) {
        val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.cancel()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun vib(context: Context, duration: Any) {
        val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        if (duration is VibPattern) {
            val vibrationEffect = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                VibrationEffect.createWaveform(duration.duration, -1)
            } else {
                @Suppress("DEPRECATION")
                VibrationEffect.createWaveform(duration.duration, -1)
            }
            vibrator.vibrate(vibrationEffect)
        } else if (duration is Int) {
            val durationMillis = duration.toLong()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val vibrationEffect = VibrationEffect.createOneShot(durationMillis, VibrationEffect.DEFAULT_AMPLITUDE)
                vibrator.vibrate(vibrationEffect)
            } else {
                vibrator.vibrate(durationMillis)
            }
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val vibrationEffect = VibrationEffect.createOneShot(200L, VibrationEffect.DEFAULT_AMPLITUDE)
                vibrator.vibrate(vibrationEffect)
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(200L)
            }
        }
    }
}
enum class VibPattern(val duration: LongArray) {
    NotificationTingTing(longArrayOf(100, 100, 100, 100, 100, 100)),
    Alert(longArrayOf(300, 100, 300, 100, 300)),
    DoubleTap(longArrayOf(50, 50, 50, 50)),
    ShortBurst(longArrayOf(100, 50, 100, 50, 100)),
    LongBurst(longArrayOf(200, 100, 200, 100, 200)),
    Buzz(longArrayOf(50, 200, 50, 200, 50)),
    Reminder(longArrayOf(100, 100, 200, 100, 100, 200))
}
