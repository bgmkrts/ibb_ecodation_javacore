- Maven Nedir ?
  proje oluşturma, raporlama ve belgeleri yönetme işlevlerini kolaylaştıran bir yazılım projesi yönetimi
  ve anlama aracıdır.Başka bir deyişle, proje geliştirirken kütüphane bağımlılığını ve IDE bağımlılığını
  ortadan kaldırmamızı, geliştirme sürecini basitleştirmemizi, dokümantasyonumuzu etkili bir şekilde
  oluşturmamızı ve bir standart oluşturmamızı sağlayan bir araçtır.
- pom.xml nedir ?
  Projede kullanılacak tüm kütüphaneler ve eklentiler (Bağımlı kaynaklar)
  Maven’ın temel iş birimi olan POM ( Poject Object Model ) dosyasından kolayca yönetilebilmektedir.
- JDK  nedir ?
  java için SDK(Software Development Kit) diyebiliriz.
  Hem yorumlayıcı hem de derleyici görevini üstlenmektedir.
  JDK=JRE + Compiler + debugger
- JRE  nedir ?
  java programlama dili ile yazılmış olan uygulama ve
  appletlerin çalışmasını sağlayan bileşenler ile JVM e kütüphaneler sağlar.

- Compiler  nedir ?
  , farklı bir dilde oluşturulan kaynak
  kodun istenilen farklı bir kod haline dönüştürülmesine yardımcı olan otomatikleştirilmiş programlardır.
- JVM  nedir ?
  platforma bağımlı olarak çalışır. Yani geliştirme yapacağınız
  platforma(Windows,Linux,Mac) göre farklı implementasyonları mevcuttur.

- Interpreter nedir ?
  yazılım kodunu satır satır veya blok blok okuyarak ve anında çalıştırarak işleyen bir programdır.
- Java nedir ?
  Sun Microsystems tarafından geliştirilmiş olan Java ilk kez 1995 yılında piyasaya sunuldu.
  Java; geniş kullanım alanına sahip, sınıf tabanlı, nesne yönelimli olarak tanımlanan bir programlama dilidir.
- Java Özellikleri nelerdir ?
- Data types  nedir ?
- primitive types  nedir ?
  byte,short,int,long,float,double,char,boolean,
- Wrapper types nedir ?
  primitive türü nesneye dönüştüren yapı

-jar ile war arasındaki fark nedir?


Özellik	JAR (Java Archive)                                 	                   WAR (Web Application Archive)
Kullanım Alanı	Standalone Java uygulamaları                                  	Web uygulamaları (Servlet, JSP, Spring vb.)
Çalıştırma	java -jar uygulama.jar ile doğrudan çalıştırılabilir	            Servlet konteyner (Tomcat, WildFly vb.) gerektirir
İçerik	.class dosyaları, kütüphaneler	                                        JSP, HTML, CSS, JavaScript, WEB-INF ve servletler
Bağımlılıklar	.jar dosyalarını içerebilir                                  	WEB-INF/lib içinde .jar dosyalarını barındırır
Dağıtım Yeri	İstediğiniz yerde çalıştırılabilir                          	Tomcat, Jetty gibi web sunucularına yüklenir

Özet:
🔹 JAR = Konsol, masaüstü veya bağımsız çalışan uygulamalar için.
🔹 WAR = Web sunucusunda çalışan web tabanlı uygulamalar için.


camelCase yazım nedir ? begumKaratas
PascalCase yazım nedir ?BegumKaratas
kebab-case yazım nedir ?begum_karatas

-------------------------------------

int number1=10;
number1++;
System.out.println(number1);

int number2=10;
++number2;
System.out.println(number2);

stack memory- heap memory
stack memory;Stack'de çöp toplama (garbage collector) işlemi otomatik olarak gerçekleştirilir.
Programcının bu konuda herhangi bir adım atmasına gerek yoktur.



Değer tipler (int, double, char, struct ) Stack’te,
referans tipler (class, pointer, string, array,interface) ise Heap alanında tutulmaktadır.


Escape Character

scanner class

-------------------
3.Ders Ödevi (8 Şubat)String'ten int geçerken Scanner nasıl çözebiliriz ?

//System.out.println("Lütfen soyadınız giriniz:");
surname=klavye.nextLine();
System.out.println("Bildiğiniz Diller & Teknolojiler");
language=klavye.nextInt();//


Java'da en pratik ve en çok kullanılan yöntem, Scanner.nextLine() kullanarak girdiyi
String olarak almak ve Integer.parseInt() ile int türüne dönüştürmektir.
Bu yöntem, hem hata yönetimi sağlar hem de nextInt() sonrası nextLine() sorunlarını önler

        System.out.println("Lütfen soyadınızı giriniz:");
        String surname = klavye.nextLine();

        System.out.println("Bildiğiniz Diller & Teknolojiler (kaç tane):");
        int languageCount = 0; // Varsayılan değer

        try {
            languageCount = Integer.parseInt(klavye.nextLine()); // Kullanıcının girdiği değeri int'e çevir
        } catch (NumberFormatException e) {
            System.out.println("Hatalı giriş! Lütfen bir sayı giriniz.");
        }


***************************************************


null değeri ne zaman kullanabilirim ?
Java'da null değeri, bir nesne referansının herhangi bir nesneye işaret etmediğini belirtmek için kullanılır.
İşte null değerinin kullanıldığı başlıca durumlar:
1. Değişkenlere Başlangıç Değeri Olarak null Atamak
   Eğer bir nesne referansına henüz bir değer atanmamışsa, null ile başlatılabilir:


String name = null;
System.out.println(name); // null çıktısı verir
2. Nesne Olup Olmadığını Kontrol Etmek (null Kontrolü)
   Bir nesnenin null olup olmadığını kontrol etmek, NullPointerException hatasından kaçınmak için önemlidir.

String message = null;
if (message != null) {
System.out.println(message.length());
} else {
System.out.println("message değişkeni null!");
}

3. null Değerini Parametre Olarak Kullanmak
   Eğer bir metot opsiyonel bir parametre alıyorsa, null geçilebilir.

public void printName(String name) {
if (name != null) {
System.out.println("İsim: " + name);
} else {
System.out.println("İsim girilmedi.");
}
}

printName(null); // "İsim girilmedi." çıktısı verir

4. null Kullanarak Bir Nesneyi Serbest Bırakmak
   Bellekte yer açmak için referansı null yapabilirsiniz. Ancak, Java'da çöp toplayıcı (Garbage Collector)
   otomatik olarak ilgilenir.


Person person = new Person("Ali");
person = null; // person nesnesi artık erişilemez, çöp toplayıcı temizleyecektir.

5. null Kullanımı ve Optional Sınıfı
   Java 8 ve sonrası, null yerine Optional kullanmayı önerir.


import java.util.Optional;

Optional<String> optionalName = Optional.ofNullable(null);
System.out.println(optionalName.orElse("Varsayılan Değer"));

*****************************************************************************

4.Ders Ödevi (11 Şubat)
switch-case ile if-elseif-else arasındaki farklar nelerdir ?
Sadece eşitlik kontrolü gerekiyorsa → switch-case tercih edilir.
Karmaşık koşullar ve karşılaştırmalar gerekiyorsa → if-elseif-else kullanılır.

for ile while arasındaki farklar
Eğer döngüde belirli bir sayıda işlem yapılacaksa → for kullanılır.
Eğer tekrar sayısı belirsiz ve bir koşula bağlıysa → while kullanılır.

String Birleştirme (Concatenation) türleri, Concat, StrinBuilder, StringBuffer return, continue, break nedir ?
aralarındaki farklar nelerdir ?
return, metottan çıkış yapar. break, döngüyü kırar. continue, bir döngünün mevcut iterasyonunu atlar.
concat()	İki string'i birleştirir ama null kontrolü yapmaz.
StringBuilder	Değiştirilebilir string oluşturur, hızlıdır.
StringBuffer	StringBuilder gibidir, ancak thread-safe'dir.

static yapı nedir ?
static, Java'da bir değişken, metot veya blok tanımlarken kullanılan bir anahtar kelimedir.
Nesneye değil, sınıfa aittir.
Bellekte sadece bir kez yer kaplar.
Nesne oluşturmadan erişilebilir.
Genellikle ortak veriler ve yardımcı metotlar için kullanılır.

Overloading nedir ?
Bir methodun aynı isimde ve farklı parametre tipleri veya parametre sayısı ile tanımlanmasıdır.
Override nedir ?

String kelime= new String(); , String kelime= ""; iki yapı arasındaki fark ?
System.out.println(vocabulary1== vocabulary2); System.out.println(vocabulary1.equals(vocabulary2));

5.Ders Ödevi (13 Şubat)
parametre ile argüman arasında farklar nelerdir ?
Bir metoda gönderilen değere argüman denir. Bu değerleri alan ve işlem yapan değişkenlere ise parametre denir.
Integer.valueOf(cast4String) ile Integer.parseInt(cast4String) arasındaki fark ?

Yöntem	                      Dönen Tür	                   cache Mekanizması	Kullanım Amacı
Integer.valueOf(String s)	Integer (Wrapper)	-128 ile 127 arasında cache kullanır	Koleksiyonlar, nesne gerektiren durumlar
Integer.parseInt(String s)	int (Primitive)	Cache yoktur	Performans gerektiren işlemler

java8 bilmek neden zorundayım ?
Java 8 bilmek önemli çünkü:

✅ Modern Java’nın temeli → Sonraki Java sürümleri Java 8 üzerine kurulu.
✅ Lambda & Stream API → Kod daha kısa ve performanslı olur.
✅ Functional Interface’ler → Predicate, Consumer, Function gibi yapılar yaygın.
✅ Paralel işlem (Concurrency) → parallelStream(), CompletableFuture gibi yenilikler geldi.
✅ Günümüz framework’leri (Spring Boot, Hibernate, Quarkus) Java 8 kullanıyor.
✅ Optional ile NullPointerException riskini azaltır.

📌 Kısacası, Java 8 bilmeden modern Java geliştiremezsin!

Java 8 ile gelen özellikler nelerdir ?
Java 8 ile gelen başlıca özellikler:

✅ Lambda Expressions → Daha kısa ve okunaklı fonksiyonel kod yazmayı sağlar.
✅ Stream API → Koleksiyonları (List, Set) daha hızlı ve işlevsel işlemenizi sağlar.
✅ Functional Interfaces → Predicate, Consumer, Function gibi fonksiyonel arayüzler geldi.
✅ Optional Class → NullPointerException riskini azaltan güvenli veri türü.
✅ Default & Static Methods in Interfaces → Arayüzlerde gövdesi olan metodlar yazılabilir.
✅ New Date & Time API → LocalDate, LocalTime, LocalDateTime gibi sınıflarla modern tarih/saat işlemleri.
✅ Parallel Streams → Çoklu iş parçacığı (multithreading) ile koleksiyonları paralel işleme yeteneği.
✅ CompletableFuture API → Asenkron programlama için gelişmiş Future yapısı.

🚀 Java 8, modern Java’nın temelini oluşturur!


6.Ders Ödevi (15 Şubat)
Array => foreach ile iterative for döngü arasındaki farklar nelerdir ?

forEach, basit veri işlemleri için temiz bir sözdizimi sunar ama break, continue ve return gibi kontrol yapılarını desteklemez.
for ve for-of, döngü kontrolü ve performans açısından daha esnektir.
Asenkron işlemler için for-of daha uygundur.
Hangi Durumda Hangisi Kullanılmalı?
✅ Küçük ve basit işlemler için forEach
✅ Döngüyü kırmak veya atlamak gerekiyorsa for veya for-of
✅ Asenkron işlemler için for-of


7.Ders Ödevi (20 Şubat)
constructor ile static {} arasındaki farklar ?

Constructor, nesne oluşturulunca çalışır.
static {}, sınıf yüklenince bir kez çalışır ve static değişkenleri başlatır.

if(name!=null && !name.isEmpty()) bu kod ne iş yapar ?

null olup olmadığını ve boş string olup olmadığını kontrol eder.
İkisi birlikte kullanıldığında, name değişkeni ne null ne de boşsa işlem yapılır.

8.Ders Ödevi (22 Şubat)
Öğrendiklerinizi test ediniz
+

9.Ders Ödevi (22 Şubat)
StudentDto içersinde gerekli validation yazınız ? Örneğin vize,final sadece double girilecek harf veya özel simge girmeyecek

13.Ders Ödevi (4 Mart )
String name="" name==null, name.isEmpety() name.isBlank() bunlar arasındaki farklar
Predicate nedir ?

