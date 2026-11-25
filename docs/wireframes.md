# Hafta 2 — Ekran Akışı ve Wireframe Tasarımı (6 Ekran)

## Ekranlar Arası Geçiş Akışı
```
[1. Açılış / Splash]
        │ (Otomatik donanım özeti yükleme)
        ▼
[2. Ana Sayfa (Dashboard)] ──► [6. Geçmiş Raporlar]
   │        │        │
   ▼        ▼        ▼
[3. Ekran  [4. Sensör & Stres    [5. IMEI & Rapor Özeti]
  Testi]     Testi Ekranı]              │
   └────────┴───────────────────────────┘
                     ▼
             [0–100 Sağlık Skoru
              & Offline Kayıt]
```

## 6 Ekranın Kapsamı ve Persona Eşleşmesi
1. **Açılış Ekranı (Splash / İlk Kurulum):** Uygulama logosu, offline hazır göstergesi, temel cihaz modeli/RAM/pil özeti yüklemesi.
2. **Ana Sayfa (Dashboard):** Üstte cihaz kimlik kartı (model, Android sürümü, pil sıcaklığı), ortada büyük **"2 Dk Hızlı Ekspertiz Başlat"** butonu *(Persona 1 — Mert)*, altta 4 modül kartı (*Ekran, Sensörler, CPU/GPU/RAM Stres, IMEI*) *(Persona 2 — Hakan)*.
3. **Ekran Testi (Ölü Piksel & Touch-Grid):** Tam ekran RGB/Siyah/Beyaz renk geçişi ve parmakla taranan dokunmatik ızgara (grid); altta Geçti / Sorunlu onayı.
4. **Sensör & Stres Testi:** `SensorManager` canlı X/Y/Z değerleri (ivmeölçer, jiroskop, yakınlık, ışık) + CPU/GPU/RAM yük grafiği ve batarya sıcaklık göstergesi *(Persona 3 — Selin)*.
5. **IMEI Doğrulama & Ekspertiz Raporu:** `*#06#` kılavuzu, 15 haneli Luhn kontrolü, e-Devlet/BTK yönlendirmesi + tüm testlerin **0–100 Sağlık Skoru**, Geçti/Uyarı/Sorunlu listesi ve Kaydet/Paylaş butonu.
6. **Geçmiş Raporlar (Offline Arşiv):** Cihazda Room veritabanında saklanan eski ekspertiz kayıtlarının tarih, model ve skor bazlı listesi *(Persona 2 — Hakan)*.
