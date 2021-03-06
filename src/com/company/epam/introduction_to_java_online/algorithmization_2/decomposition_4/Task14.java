package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
// Для решения задачи использовать декомпозицию.

public class Task14 {
    public static void main(String[] args) {
        getResult(1000);
    }

    public static void getResult(int k){
        for(int i = 1; i <=k; i++){
            if(i == sumOfDigitsInPow(i)){
                System.out.println(i + " число Армстронга");
            }
        }
    }
    public static int sumOfDigitsInPow(int a){
        int t = a;
        int sum = 0;
        while(t!=0){
            sum = sum + (int)Math.pow(t%10,countOfDigits(a));
            t = t/10;
        }
        return sum;
    }
    public static int countOfDigits (int i) {
        int count = (i == 0) ? 1 : 0;
        while (i != 0) {
            i = i / 10;
            count++;
        }
        return count;
    }
}
