package org.example.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] massive = new int[size];
        int number = scanner.nextInt();
        boolean isFound = false;
        for (int index = 0; index < 10; index++){
            massive[index] = (int) (Math.random() * 10);
            if (massive[index] == number){
                isFound = true;
                size--;
            }
        }
        System.out.println(Arrays.toString(massive));
        int[] resultMassive = new int[size];
        int i = 0;
        for (int index = 0; index < 10; index++){
            if (massive[index] != number){
                resultMassive[i] = massive[index];
                i++;
            }
        }
        if (isFound){
            System.out.println(Arrays.toString(resultMassive));
        }
        else{
            System.out.println("Число не было обнаружено");
        }
    }
}
