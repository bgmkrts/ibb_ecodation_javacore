package com.begumkaratas._2_week;

import java.util.Scanner;

/*
1.  Kullanıcının Verdiği pozitif bir sayıya kadar toplamını yapan hesaplayan Algoritma ?
Şartlar - 1 : Kullanıcı eğer sayı olarak  100  fazla sayı girerse 100 kadar toplasın. (break)
Şartlar - 2 : Kullanıcı verdiği sayılar içinde eğer 47 varsa bunu toplamaya dahil etmesin.(continue)
 */
public class _11_1_Return_Continue_Break {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi=");
        int sayi=Math.abs(scanner.nextInt());
        int sum=0;
        for(int i=1;i<=sayi;i++){
            if(i==47)
                continue;
            if(i>100)
                break;

            sum+=i;
        }
        System.out.println(sum);
        if(sum%2==0){
            System.out.println("çift");
        }
        else
            System.out.println("tek");
    }
}

