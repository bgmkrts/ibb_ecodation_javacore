package com.begumkaratas._2_week;

import java.util.Scanner;

public class _16_2_MultipleArray {
    public static void main(String[] args) {
        int[][] matris = new int[3][3];
        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[0][2] = 3;
        matris[1][0] = 4;
        matris[1][1] = 5;
        matris[1][2] = 6;
        matris[2][0] = 7;
        matris[2][1] = 8;
        matris[2][2] = 9;

        for (int i = 0; i < matris.length; i++) { // Satır
            for (int j = 0; j < matris[i].length; j++) { // sutun
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }


        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi=scanner.nextInt();
        int faktoriyel=1;

        for(int i=1;i<=sayi;i++){
            faktoriyel=faktoriyel*i;

        }
        System.out.println(faktoriyel);
    }

}//end class