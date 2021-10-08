package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("Yıl giriniz:");
        x=input.nextInt();
        int lastDigit = x % 100;
        if(lastDigit%4==0){
            System.out.println(String.format("d bir artık yıldır.",x));
        }
        else
        {
            System.out.println(String.format("d bir artık yıl değildir.",x));
        }
    }
}
