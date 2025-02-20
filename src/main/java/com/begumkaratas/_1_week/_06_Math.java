package com.begumkaratas._1_week;

public class _06_Math {
    public static void main(String[] args) {

        //Nan:Not a Number

        System.out.println("En Küçük:"+Math.min(-300,10));
        System.out.println("En büyük:"+Math.max(-300,10));

        System.out.println("Mutlak değer:"+Math.abs(-20));

        System.out.println("Karekök:"+Math.sqrt(25));
        System.out.println("Karekök:"+Math.sqrt(+25));
        System.out.println("Karekök:"+Math.sqrt(Math.abs(-25)));

        System.out.println("Üslü"+Math.pow(2,5));

        System.out.println("Alta yuvarla"+Math.floor(2.9));
        System.out.println("Alta yuvarla"+Math.ceil(2.1));
        System.out.println("Alta yuvarla"+Math.ceil(2.0001));

        System.out.println("Ortalama yuvarla"+Math.round(3.4));
        System.out.println("Ortalama yuvarla"+Math.round(3.5));

        System.out.println("pi:"+Math.PI);
        System.out.println("E:"+Math.E);


        System.out.println("Triginometrik Sinüs: "+ Math.sin(1));
        System.out.println("Triginometrik Sinüs: "+ Math.asin(1));

        System.out.println("Triginometrik Cosinüs: "+ Math.cos(1));
        System.out.println("Triginometrik Tanjant: "+ Math.tan(1));









    }
}
