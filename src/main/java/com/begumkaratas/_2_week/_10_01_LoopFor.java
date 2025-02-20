package com.begumkaratas._2_week;

import java.util.Scanner;

public class _10_01_LoopFor {
    public static void main(String[] args) {
        // i++
        // i=i+1
        // i+=1
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" - ");
        }

        // for döngüsü sonsuzluk
        // for(;;){}

        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi=");
        int sayi=scanner.nextInt();

        if(sayi%2==0){
            System.out.println("çift");
        }
        else
            System.out.println("tek");
    }
}
