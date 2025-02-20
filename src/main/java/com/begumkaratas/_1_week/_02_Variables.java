package com.begumkaratas._1_week;

public class _02_Variables {
    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken;
        /*


            2-) _ veya $ ile başlayabilirsiniz
            3-) sayı ile bitebilir.
            4-) Sayı ile başlanmaz
            5-) _veya$ dışında özel simgelerle başlanmaz
            6-) değişken isimlerini camelCase kuralına göre yazılır
         */

        // veri isimlendirmeleri;
            //Anlamlı açıklayıcı isimler seçmeliyiz



        int schoolNumber=23;
        System.out.println(schoolNumber);
        schoolNumber=44;
        System.out.println(schoolNumber);

        int _schoolNumber=55;
        System.out.println(_schoolNumber);

        int $schoolNumber=95;
        System.out.println($schoolNumber);

        int school123=105;
        System.out.println(school123);

        // yazamazsınız
        //int schoolNumber=11; // aynı isimde yazamazsınız
        //int 44schoolNumber=11; // sayıyla başlayamazsınız.
        //int ~schoolNumber=11;   // özel simgeyle başlayamazsınız.
        //int ``schoolNumber=11;   // özel simgeyle başlayamazsınız.





    }
}
