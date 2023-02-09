package org.example.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] massive = new int[size];
        for (int i = 0; i < size; i++) {
            massive[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(massive));
        int maxNumber = Arrays.stream(massive).max().getAsInt();
        System.out.println("Максимальное число: " + maxNumber);
        int minNumber = Arrays.stream(massive).min().getAsInt();
        System.out.println("Минимальное число: " + minNumber);
        int middleNumber = Arrays.stream(massive).sum() / size;
        System.out.println("Среднее арифметическое: " + middleNumber);
    }
}
