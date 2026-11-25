# CihazEksper — İkinci El Telefon Donanım & Sensör Ekspertizi

## Problem Tanımı
İkinci el telefon satın alan kullanıcılar, alım anında ekrandaki ölü piksel ve dokunmatik kör noktalarını, bozuk sensörleri, yüksek yük altında ısınma/performans düşüşünü ve IMEI durumunu hızlıca test edemedikleri için arızalı cihaz alarak maddi zarara uğramaktadır. Satıcılar ve bireysel kullanıcılar da cihazlarının donanım sağlığını internet gerektirmeden tek ekranda kanıtlayacak güvenilir bir ekspertiz aracına ihtiyaç duymaktadır.

## Hedef Kullanıcı Grubu
- İkinci el telefon alıcıları
- İkinci el telefon satıcıları / telefon esnafı
- Kendi cihazının donanım sağlığını test etmek isteyen Android kullanıcıları

## Planlanan Temel Özellikler (6 Haftalık Yol Haritası)
- **Ekran Testleri:** Ölü piksel (RGB/Siyah/Beyaz) ve dokunmatik ölü bölge ızgarası (Touch-Grid) *(Hafta 3)*
- **Donanım Sensör Testleri:** İvmeölçer, jiroskop, manyetometre, yakınlık ve ortam ışığı canlı doğrulama *(Hafta 3)*
- **Stres & Termal Test:** CPU/GPU/RAM yük testi ve batarya sıcaklık/düşüş takibi *(Hafta 4)*
- **IMEI Doğrulama:** `*#06#` rehberi, 15 haneli Luhn algoritma kontrolü ve resmi BTK/e-Devlet yönlendirmesi *(Hafta 4)*
- **Offline Ekspertiz Raporu:** 0–100 Sağlık Skoru ve yerel Room veritabanında geçmiş kayıt *(Hafta 3–4)*

## Kişisel Teknik Kısıt
- **Donanım Sensörleri & Çevrimdışı (Offline) Çalışma:** Tüm sensör okumaları `SensorManager` üzerinden gerçek zamanlı yapılır; test akışı ve rapor arşivi SIM kart veya internet bağlantısı olmadan tamamen cihaz içinde çalışır.
