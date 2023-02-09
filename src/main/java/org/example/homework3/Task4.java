package org.example.homework3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        int[] massive1 = new int[5];
        int[] massive2 = new int[5];
        for (int i = 0; i < 5; i++){
            massive1[i] = (int) (Math.random() * 10);
            massive2[i] = (int) (Math.random() * 10);
        }
        int middleNumber1 = Arrays.stream(massive1).sum() / 5;
        int middleNumber2 = Arrays.stream(massive2).sum() / 5;
        if (middleNumber1 > middleNumber2){
            System.out.println("Арифметическое первого массива больше");
        }
        else if(middleNumber1 < middleNumber2){
            System.out.println("Арифметическое второго массива больше");
        }
        else{
            System.out.println("Арифметические массивов равны");
        }
    }
}
