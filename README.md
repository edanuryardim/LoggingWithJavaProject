### Log Levelleri Hakkında Bilgi


- **TRACE**: En detaylı log seviyesidir ve genellikle uygulamanın her adımını izlemek için kullanılır.
- **DEBUG**: Uygulamanın çalışmasıyla ilgili detaylı bilgileri sağlar ve hata ayıklama sürecinde faydalı olabilir.
- **INFO**: Genel bilgi mesajlarını temsil eder ve uygulamanın normal çalışma durumu hakkında bilgi verir.
- **WARN**: Potansiyel hataları veya uyarıları belirtir, ancak uygulamanın devam etmesine izin verir.
- **ERROR**: Hata durumlarını belirtir ve genellikle uygulamanın beklenmeyen bir şekilde durmasına neden olan hataları temsil eder.
- **FATAL**: Kritik hataları belirtir ve uygulamanın çalışmasını durdurabilecek ciddi hataları ifade eder.

- xml dosyasından level ayarını değiştirerek istediğiniz levelde log almayı sağlayabilirsiniz.

### XML Konfigürasyon Dosyasındaki Spesifik Paket Ayarı
XML konfigürasyon dosyasında belirli bir paket için log seviyesi ayarlamak için aşağıdaki ayarları kullanabilirsiniz:
``` 
<Logger name="rvcdemo1" level="info" additivity="false">
    <AppenderRef ref="file"  />
    <AppenderRef ref="ABC"  />
</Logger>
```



### Dosyaya Kaydetme İşlemi Hakkında Bilgi
Bu projede log mesajlarını dosyaya kaydetmek için özel bir konfigürasyon yapılmıştır. Log mesajları belirtilen dosyaya aşağıdaki formatta kaydedilmektedir:

- Dosya Adı: `Logdemo.log`
- Dosya Konumu: `./logs` dizini altında
- Yedek Dosya Adı Şablonu: `Logdemo-%d{HH-mm-ss-SSS}.Log`
- Dosya Formatı: `%d{HH:mm:ss} [%t] %-5level %logger{36} - %msg%n`

Bu konfigürasyon sayesinde log mesajları belirtilen dosyaya yazılmakta ve belirli bir boyuta ulaştığında yedek dosyalar oluşturulmaktadır.

