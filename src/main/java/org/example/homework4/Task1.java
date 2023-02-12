package org.example.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][][] massive = new int[5][5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                for (int x = 0; x < 5; x++){
                    massive[i][j][x] = (int) (Math.random() * 100);
                    System.out.print(massive[i][j][x] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.print("Введите, на сколько нужно изменить элементы массива: ");
        int diff = scanner.nextInt();
        System.out.println("\nChanged\n");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                for (int x = 0; x < 5; x++){
                    massive[i][j][x] += diff;
                    System.out.print(massive[i][j][x] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
