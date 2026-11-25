# Hedef Kullanıcı Personaları ve Gereksinimler

## Persona 1: Mert (21, Üniversite Öğrencisi — 2. El Alıcı)
- **Durum:** İlan sitesinden bütçesine uygun 2. el telefon alacak; teknik bilgisi orta düzeyde.
- **Neden kullanır?** Satıcıyla kafede buluştuğunda 2 dakikada dokunmatik, sensör, kamera ve ısınma testlerini yapıp gizli arızalı cihaz almamak için.
- **Uygulamaya Yansıyan Gereksinimler:**
  - Ana ekranda tek dokunuşla **"Hızlı Ekspertiz Başlat"** butonu
  - İnternetsiz / SIM kartsız cihazda %100 **offline** çalışma
  - 2–3 dakikada tamamlanan rehberli test akışı

## Persona 2: Hakan (34, 2. El Telefoncu / Esnaf)
- **Durum:** Küçük bir telefon dükkanı işletiyor, günde 5–10 ikinci el cihaz alıp satıyor.
- **Neden kullanır?** Aldığı her telefonu standart bir listeden hızlıca geçirip müşterisine güven veren 0–100 puanlı ekspertiz raporu sunmak için.
- **Uygulamaya Yansıyan Gereksinimler:**
  - Standart ve tekrarlanabilir test kategorileri (Ekran, Sensör, Stres, IMEI)
  - 0–100 **Sağlık Skoru** ve Geçti/Uyarı/Sorunlu özeti
  - Geçmiş testlerin cihazda yerel (Room) saklanması

## Persona 3: Selin (27, Çalışan — Bireysel Satıcı)
- **Durum:** Kendi telefonunu yükseltmek için satacak; son zamanlarda pil/ısınma şüphesi var.
- **Neden kullanır?** Cihazının gerçekten sağlam olup olmadığını görmek ve satış ilanına somut donanım raporu ekleyip hızlı satmak için.
- **Uygulamaya Yansıyan Gereksinimler:**
  - Batarya sıcaklığı ve CPU/GPU yük altında ısınma (throttling) özeti
  - Teknik olmayan kullanıcıların anlayacağı sade dilde rapor kartı
  - Raporu paylaşma / ekran görüntüsü alma kolaylığı

---

## AI'ın Gerçek Dışı Varsayımları ve Düzeltmeler
1. **Varsayım:** Uygulama telefonun IMEI'sini otomatik okuyup BTK'dan sorgular.  
   **Düzeltme:** Android 10+ izin kısıtı nedeniyle `*#06#` rehberi + 15 haneli **Luhn doğrulaması** + e-Devlet/BTK yönlendirmesi tasarlandı.
2. **Varsayım:** Testler Wi-Fi ortamında 15 dakikalık bulut benchmark'ı olarak yapılır.  
   **Düzeltme:** 2. el alımında cihaz genelde internetsizdir; akış %100 offline ve 2–3 dk olacak şekilde sadeleştirildi.
3. **Varsayım:** Kullanıcı ham sensör/termal değerleri (m/s², lux) doğrudan yorumlar.  
   **Düzeltme:** Ham verilerin yanına Geçti / Uyarı / Sorunlu rozetleri ve 0–100 Sağlık Skoru eklendi.
