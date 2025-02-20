package com.begumkaratas._1_week;

import java.util.Scanner;

public class Week1_examples_1 {
    public static void main(String[] args) {
        // 1. Dereceden 1 Bilinmeyenli Denklemi Çözme (Scanner kullanlalım)
        //      Soru:
        //      Kullanıcıdan ax + b = 0 denklemindeki a ve b değerlerini alıp x'i hesaplayan programı yazınız.
        //      Çözüm:

        Scanner scanner=new Scanner(System.in);

        System.out.println("a:");
        double a=scanner.nextDouble();

        System.out.println("b:");
        double b=scanner.nextDouble();

        double formul= -b/a;
        System.out.println(formul);




    }
}
