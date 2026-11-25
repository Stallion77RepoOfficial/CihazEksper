package com.cihazeksper.app.hardware

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.hardware.Sensor
import android.hardware.SensorManager
import android.os.BatteryManager
import android.os.Build
import com.cihazeksper.app.data.model.DeviceSnapshot
import java.util.Locale

/**
 * Acilis ekraninda gosterilen temel cihaz ozetini tamamen offline okur.
 */
object DeviceInfoProvider {

    fun readSnapshot(context: Context): DeviceSnapshot {
        val model = "${Build.MANUFACTURER.replaceFirstChar { it.uppercase() }} ${Build.MODEL}"
        val androidVer = "Android ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT})"

        val am = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val memInfo = ActivityManager.MemoryInfo()
        am.getMemoryInfo(memInfo)
        val totalRamGb = String.format(Locale.US, "%.1f GB", memInfo.totalMem / (1024.0 * 1024.0 * 1024.0))

        val cpuCores = Runtime.getRuntime().availableProcessors()

        val sm = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val sensorCount = sm.getSensorList(Sensor.TYPE_ALL).size

        val batteryIntent = context.registerReceiver(null, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
        val rawTemp = batteryIntent?.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0) ?: 0
        val tempC = rawTemp / 10f

        return DeviceSnapshot(
            deviceModel = model,
            androidVersion = androidVer,
            totalRamGb = totalRamGb,
            cpuCores = cpuCores,
            sensorCount = sensorCount,
            batteryTempC = tempC,
            isOfflineReady = true
        )
    }
}
