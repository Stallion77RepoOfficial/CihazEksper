# AI Günlüğü ve Fikir Geliştirme Kaydı

> Bu tablo 6 hafta boyunca büyüyen tek bir kayıttır; eski satırlar silinmez.

## Hafta 1 — Fikir Seçimi ve Değişiklik Tablosu
| AI Önerisi | Benim Değişikliğim | Neden Değiştirdim? |
| :--- | :--- | :--- |
| Sadece ivmeölçer ve jiroskop değerlerini listeleyen basit sensör aracı | Touch-grid, ölü piksel, CPU/GPU/RAM stres ve pil sıcaklığı ekleyerek 2. el ekspertiz akışına dönüştürdüm | Alıcıların en çok mağdur olduğu gizli arızalar ekran ve ısınma/throttling |
| IMEI'yi otomatik okuyup API ile sorgulayan modül | `*#06#` rehberi + yerel Luhn doğrulama + resmi BTK/e-Devlet yönlendirmesi | Android 10+ izin kısıtı ve Google Play politikası engeli |
| Test sonuçlarını sadece anlık ekranda gösterme | 0–100 Sağlık Skoru ve yerel offline Ekspertiz Raporu arşivi ekledim | Alıcı/satıcının sonuçları kıyaslayabilmesi ve kanıt saklayabilmesi için |

## AI Günlüğü Tablosu
| Hafta | Aşama | AI'a Verilen Görev (Özet) | AI Çıktısı | Benim Yaptığım | Neden? |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 1 | Fikir Üretimi | Gerçek günlük problemleri çözen 20 mobil uygulama fikri üret. | 20 farklı alan ve özellik önerisi verdi. | 2. el telefon donanım ekspertiz fikrini seçip kapsamını stres + ekran + sensör olarak genişlettim. | En somut maddi zararı önleyen ve gerçek hayatta karşılığı en yüksek problem buydu. |
| 1 | Persona | 2. el telefon ekspertiz uygulaması için 3 hedef kullanıcı personası oluştur. | 3 persona ve kullanım senaryosu üretti. | Wi-Fi/15 dk test ve teknik bilgi varsayımlarını çıkarıp 2 dk offline senaryoya çevirdim. | Gerçek 2. el alımında cihaz genelde internetsiz ve alıcının vakti kısıtlıdır. |
| 1 | Kapsam / IMEI | Android'de IMEI kontrolü modülünü tasarla. | Otomatik IMEI okuyan ve API'ye atan yapı önerdi. | **(AI Hatası Düzeltme)** Otomatik okumayı kaldırıp Luhn doğrulama + BTK yönlendirmesi koydum. | Android 10+ cihazlarda Play uygulamaları IMEI okuyamaz; AI güncel kısıtı atladı. |
| 1 | README & Kapsam | Proje deposu için README problem tanımı ve teknik modül taslağı oluştur. | Genel özellik listesi ve kurulum şablonu verdi. | Kendi problem cümlemi, offline çalışma vurgusunu ve sensör/stres modüllerini ekledim. | AI'ın genel şablonu projenin somut 2. el alım-satım senaryosunu yeterince yansıtmıyordu. |
