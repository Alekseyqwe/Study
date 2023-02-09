package org.example.homework3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        int[] massive = new int[10];
        int number = 5;
        boolean isNumber = false;
        for (int index = 0; index < 10; index++){
            massive[index] = (int) (Math.random() * 10);
            if (number == massive[index]){
                isNumber = true;
            }
        }
        System.out.println(Arrays.toString(massive));
        if (isNumber){
            System.out.println("Есть");
        }
        else{
            System.out.println("Нету");
        }
    }
}
