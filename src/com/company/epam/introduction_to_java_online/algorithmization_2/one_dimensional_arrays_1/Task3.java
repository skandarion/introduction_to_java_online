package com.company.epam.introduction_to_java_online.algorithmization_2.one_dimensional_arrays_1;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task3 {
    public static void main(String[] args) {
        getResult(10);
    }

    public static void getResult (int n){
        double[] array = new double[n];
        for (int i = 0; i < n; i ++){
            array[i] = Math.random()*200 - 100;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        int countNeg = 0, countPos = 0, countNull = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0) countNeg++;
            else if (array[i] == 0) countNull++;
            else countPos++;
        }
        System.out.println("\nnegative: " + countNeg + "\npossitive: " + countPos + "\nnull: " + countNull);
    }
}

