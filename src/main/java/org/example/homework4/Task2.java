package org.example.homework4;

public class Task2 {
    public static void main(String[] args){
        String[][] desk = new String[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (i % 2 == 0){
                    if (j % 2 == 0){
                        desk[i][j] = "W";
                        System.out.print(desk[i][j] + "  ");
                    }
                    else{
                        desk[i][j] = "B";
                        System.out.print(desk[i][j] + "  ");
                    }
                }
                else {
                    if (j % 2 == 0){
                        desk[i][j] = "B";
                        System.out.print(desk[i][j] + "  ");
                    }
                    else{
                        desk[i][j] = "W";
                        System.out.print(desk[i][j] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
