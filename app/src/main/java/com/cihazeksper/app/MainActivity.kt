package com.cihazeksper.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.cihazeksper.app.hardware.DeviceInfoProvider
import com.cihazeksper.app.ui.DashboardScreen
import com.cihazeksper.app.ui.theme.CihazEksperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val snapshot = DeviceInfoProvider.readSnapshot(this)
        setContent {
            CihazEksperTheme {
                DashboardScreen(snapshot = snapshot)
            }
        }
    }
}
