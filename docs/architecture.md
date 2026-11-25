# Hafta 2 — Teknik Mimari ve Veri Modeli

## 1. Mimari Diyagram (MVVM + Offline-First)
```
[UI Katmanı (Jetpack Compose)]
  DashboardScreen / ScreenTest / SensorStress / ReportScreen
          │  (StateFlow / Events)
          ▼
[ViewModel Katmanı]
  DashboardViewModel / InspectionViewModel / ReportViewModel
          │
          ▼
[Repository & Donanım Servisleri]
  InspectionRepository ──► HardwareProbes (SensorManager, BatteryManager, CPU/GPU/RAM)
          │
          ▼
[Yerel Veri Katmanı (Room / SQLite)]
  InspectionDao / TestResultDao ──► cihaz_eksper.db (Cihaz İçi Offline)
```

## 2. Üç Mimari Karşılaştırması

| Kriter | Firebase (Firestore) | REST API (Özel Backend) | Yerel SQLite / Room *(Seçilen)* |
| :--- | :--- | :--- | :--- |
| **Offline Çalışma** | Kısıtlı cache; ilk kurulum ve senkronizasyon internet ister | İnternet olmadan çalışmaz (ek yerel cache gerekir) | **%100 çevrimdışı** çalışır, SIM/Wi-Fi gerekmez |
| **Gecikme / Hız** | Ağ gecikmesine bağlı | Sunucu + ağ gecikmesine bağlı | Milisaniye düzeyinde anlık okuma/yazma |
| **Maliyet & Bakım** | Kota aşımında ücretli, SDK boyutu büyük | Sunucu hosting, SSL, API bakımı maliyeti var | Sıfır sunucu maliyeti, Play Console gizlilik formu sade |
| **Dezavantajı** | **Seçilmeme nedeni:** 2. el alımında cihaz genelde internetsizdir; gereksiz bulut bağımlılığı ve veri gizliliği yükü yaratır. | **Seçilmeme nedeni:** Tek cihazda yerel donanım testi için sunucu kurmak aşırı mühendislik ve çevrimdışı ortamda başarısız olur. | Cihazlar arası otomatik bulut senkronizasyonu yoktur (rapor paylaşımı dışa aktarma ile çözülür). |

**Seçilen Mimari Gerekçesi:** Kişisel kısıtımız olan **Donanım Sensörleri & Çevrimdışı (Offline) Çalışma** gereği, ikinci el telefon alım-satımında cihazda genellikle SIM kart veya Wi-Fi bulunmadığından **MVVM + Yerel Room (SQLite)** mimarisi seçilmiştir.

## 3. Veri Modeli (Room Tabloları ve Erişim)

| Tablo Adı | Sütunlar | Nerede Tutulur? | Kim Erişebilir? |
| :--- | :--- | :--- | :--- |
| `inspections` | `id (PK)`, `deviceModel`, `androidVersion`, `createdAt`, `healthScore (0-100)`, `batteryTempStart`, `batteryTempEnd`, `imeiStatus`, `notes` | Cihaz içi SQLite (`Room`) | Yalnızca uygulama (App-private storage) |
| `test_results` | `id (PK)`, `inspectionId (FK)`, `category (SCREEN/SENSOR/STRESS/IMEI)`, `testName`, `status (PASS/WARN/FAIL)`, `measuredValue`, `durationMs` | Cihaz içi SQLite (`Room`) | Yalnızca uygulama (App-private storage) |
| `device_snapshots` | `id (PK)`, `inspectionId (FK)`, `totalRamMb`, `cpuCores`, `sensorCount`, `batteryLevel` | Cihaz içi SQLite (`Room`) | Yalnızca uygulama (App-private storage) |
