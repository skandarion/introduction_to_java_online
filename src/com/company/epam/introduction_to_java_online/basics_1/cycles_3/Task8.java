package com.company.epam.introduction_to_java_online.basics_1.cycles_3;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {
    public static void main(String[] args) {
        getResult(2312,512512);
    }

    public static void getResult(int a, int b){
        int c,d,e;

//       int length = (int)Math.log10(Math.min(a,b))+1;
//       int[] array = new int[length];
//       int i = 0;

        while (a > 0){
            c = a % 10;
            a = a / 10;
            e = b;
            while (e > 0){
                d = e % 10;
                e = e / 10;
                if(d == c){
                    System.out.println(d);
                    }
                }
            }
        }
    }

