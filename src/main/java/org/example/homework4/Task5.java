package org.example.homework4;

public class Task5 {
    public static void main(String[] args){
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (i == j){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (i + j == 9){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
