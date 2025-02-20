package com.begumkaratas._1_week;

import java.util.Scanner;

public class Week1_examples_2 {
    public static void main(String[] args) {
        // Santigrat (Celsius) - Fahrenheit Dönüştürücü (Scanner kullanlalım)
        //   Soru:
        //   Kullanıcıdan Santigrat (Celsius) cinsinden sıcaklık alıp Fahrenheit'e çeviren programı yazınız.
        //   Formül: F = (C * 9/5) + 32
        //   Çözüm:

        Scanner scanner=new Scanner(System.in);
        System.out.println(" Santigrat (Celsius) cinsinden sıcaklık :");
        double sicaklik=scanner.nextDouble();

        double formul=(sicaklik*9/5)+32;
        System.out.println(formul);

    }
}
