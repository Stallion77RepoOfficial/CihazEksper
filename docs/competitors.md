# Hafta 2 — Play Store Rakip İncelemesi (2 Benzer Uygulama)

## Rakip 1: TestM - Check Phone Status (`com.testm.app`)
- **Mağaza Açıklaması & Özellikleri:** 20'den fazla otomatik ve etkileşimli donanım testi (dokunmatik ekran, hoparlör/kulaklık/mikrofon, jiroskop/ivmeölçer/pusula, Wi-Fi/Bluetooth/hücresel/GPS, yakınlık/ışık/parmak izi sensörü, ön-arka kamera ve LED flaş), IMEI çalıntı/kilit kontrolü, ikinci el alım-satım için çevrimiçi rapor sertifikası ve yakındaki tamirci bulucu sunar.
- **Ekran Görüntüleri İncelemesi:** Kategori bazlı test kartları (Screen, Sound, Motion, Connectivity, Hardware, Camera), etkileşimli ekran dokunmatik çizim ekranı ve yeşil/kırmızı sonuç listesi öne çıkar.
- **Zayıf Yönleri:** Arayüz İngilizce ağırlıklı ve reklamlıdır; CPU/GPU/RAM termal stres ve ısınma (throttling) testi bulunmaz; çevrimiçi rapor sertifikası internetsiz (SIM kartsız) cihazda oluşturulamaz ve Türkiye'ye özel e-Devlet/BTK IMEI sorgu akışı yoktur.

## Rakip 2: Phone Doctor Plus (`com.idea.PhoneDoctorPlus` — iDea Mobile Tech Inc.)
- **Mağaza Açıklaması & Özellikleri:** 40'tan fazla donanım ve sistem testi (RGB ölü piksel, çoklu dokunma, ses/mikrofon, kamera/otomatik odak, ivmeölçer/jiroskop/yakınlık/ışık/barometre/parmak izi sensörleri, fiziksel tuşlar, Wi-Fi/GPS), canlı CPU/RAM/depolama izleme, pil sağlığı/sıcaklık/voltaj takibi ve takas (trade-in) değer tahmini sunar.
- **Ekran Görüntüleri İncelemesi:** Çok sayıda küçük test ikonu, sistem kaynak göstergeleri, çizimle dokunmatik ekran testi ve geçti/kaldı (pass/fail) özet ekranları gösterir.
- **Zayıf Yönleri:** İlk açılış yapılandırması ve raporlama/takas özellikleri için kararlı internet bağlantısı gerektirir; 40+ teknik test standart bir ikinci el alıcısı için karmaşıktır; kontrollü CPU/GPU/RAM termal stres testi yerine yalnızca anlık kullanım yüzdesi gösterir ve Türkiye'ye uygun IMEI Luhn/BTK akışı yoktur.

## Bizim Farkımız (Tek Cümle)
**CihazEksper, rakiplerinden farklı olarak başlangıçta veya raporlamada internet gerektirmeyen (%100 offline) ve reklamsız tek bir 2 dakikalık akışta ölü piksel/dokunmatik ekran testi, tüm donanım sensörleri, kontrollü CPU/GPU/RAM termal stres testi ve Türkiye'ye uygun IMEI Luhn/BTK kontrolünü birleştirerek herkesin anlayacağı 0–100 Ekspertiz Raporu sunar.**
