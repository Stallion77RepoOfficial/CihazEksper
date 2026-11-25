package com.cihazeksper.app.data.model

/**
 * Hafta 2 — Offline Room veri modeli taslagi.
 * Hafta 3'te @Entity / @Dao anotasyonlariyla Room veritabanina baglanacaktir.
 */
enum class TestCategory {
    SCREEN,
    SENSOR,
    STRESS,
    IMEI
}

enum class TestStatus {
    PENDING,
    PASS,
    WARN,
    FAIL
}

data class Inspection(
    val id: Long = 0L,
    val deviceModel: String,
    val androidVersion: String,
    val createdAtEpochMs: Long,
    val healthScore: Int,
    val batteryTempStartC: Float,
    val batteryTempEndC: Float,
    val imeiStatus: String,
    val notes: String = ""
)

data class TestResult(
    val id: Long = 0L,
    val inspectionId: Long,
    val category: TestCategory,
    val testName: String,
    val status: TestStatus,
    val measuredValue: String,
    val durationMs: Long
)

data class DeviceSnapshot(
    val deviceModel: String,
    val androidVersion: String,
    val totalRamGb: String,
    val cpuCores: Int,
    val sensorCount: Int,
    val batteryTempC: Float,
    val isOfflineReady: Boolean = true
)
