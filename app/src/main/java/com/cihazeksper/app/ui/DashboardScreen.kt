package com.cihazeksper.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cihazeksper.app.data.model.DeviceSnapshot
import com.cihazeksper.app.ui.theme.*

@Composable
fun DashboardScreen(snapshot: DeviceSnapshot) {
    var statusMessage by remember {
        mutableStateOf("Hafta 2 Acilis Ekrani Hazir — Test modulleri Hafta 3 ve 4'te aktif edilecek.")
    }

    Scaffold(
        containerColor = NavyBg
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Ust Baslik + Offline Rozeti (Persona 1: Mert)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "CihazEksper",
                        color = TextPrimary,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "2. El Telefon Donanım Ekspertizi",
                        color = TextMuted,
                        fontSize = 12.sp
                    )
                }
                Surface(
                    color = AccentGreen.copy(alpha = 0.16f),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(
                        text = "● OFFLINE HAZIR",
                        color = AccentGreen,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                    )
                }
            }

            // Cihaz Ozet Karti (Gerçek offline donanim verisi)
            Card(
                colors = CardDefaults.cardColors(containerColor = CardBg),
                shape = RoundedCornerShape(14.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(
                        text = snapshot.deviceModel,
                        color = TextPrimary,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = snapshot.androidVersion,
                        color = TextMuted,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        InfoPill("RAM", snapshot.totalRamGb)
                        InfoPill("CPU", "${snapshot.cpuCores} Çekirdek")
                        InfoPill("Sensör", "${snapshot.sensorCount} Adet")
                        InfoPill("Pil", "${snapshot.batteryTempC}°C")
                    }
                }
            }

            // Ana CTA Butonu (Persona 1: 2 Dakikalik Hizli Ekspertiz)
            Button(
                onClick = {
                    statusMessage = "Hızlı Ekspertiz akışı Hafta 3'te (Ekran + Sensörler) bağlanacak."
                },
                colors = ButtonDefaults.buttonColors(containerColor = AccentBlue),
                shape = RoundedCornerShape(14.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
            ) {
                Icon(Icons.Default.PlayArrow, contentDescription = null, tint = NavyBg)
                Spacer(Modifier.width(8.dp))
                Text(
                    text = "2 DK HIZLI EKSPERTİZ BAŞLAT",
                    color = NavyBg,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }

            // 4 Modul Karti (Persona 2 & 3: Hakan & Selin)
            Text(
                text = "Test Modülleri",
                color = TextPrimary,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                ModuleCard(
                    title = "Ekran & Dokunmatik",
                    subtitle = "Ölü piksel + Grid (H3)",
                    icon = Icons.Default.Smartphone,
                    modifier = Modifier.weight(1f),
                    onClick = { statusMessage = "Ekran testi modülü Hafta 3'te eklenecek." }
                )
                ModuleCard(
                    title = "Tüm Sensörler",
                    subtitle = "İvme, Jiro, Işık (H3)",
                    icon = Icons.Default.Sensors,
                    modifier = Modifier.weight(1f),
                    onClick = { statusMessage = "Sensör testleri Hafta 3'te eklenecek." }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                ModuleCard(
                    title = "CPU / GPU / RAM",
                    subtitle = "Stres & Isınma (H4)",
                    icon = Icons.Default.Speed,
                    modifier = Modifier.weight(1f),
                    onClick = { statusMessage = "CPU/GPU/RAM stres testi Hafta 4'te eklenecek." }
                )
                ModuleCard(
                    title = "IMEI & Rapor",
                    subtitle = "Luhn + BTK + Skor (H4)",
                    icon = Icons.Default.VerifiedUser,
                    modifier = Modifier.weight(1f),
                    onClick = { statusMessage = "IMEI Luhn + BTK kontrolü Hafta 4'te eklenecek." }
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            // Durum Cubugu
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(CardBg, RoundedCornerShape(10.dp))
                    .padding(12.dp)
            ) {
                Text(
                    text = statusMessage,
                    color = TextMuted,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
private fun InfoPill(label: String, value: String) {
    Column(horizontalAlignment = Alignment.Start) {
        Text(text = label, color = TextMuted, fontSize = 11.sp)
        Text(text = value, color = TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
    }
}

@Composable
private fun ModuleCard(
    title: String,
    subtitle: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(containerColor = CardBg),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier.height(96.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(icon, contentDescription = title, tint = AccentBlue, modifier = Modifier.size(22.dp))
            Column {
                Text(text = title, color = TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                Text(text = subtitle, color = TextMuted, fontSize = 11.sp)
            }
        }
    }
}
