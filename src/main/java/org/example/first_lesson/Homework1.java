package org.example.first_lesson;

public class Homework1 {
    public static void main(String[] args){
        int i = 1;
        while (i <= 31){
            if(i == 8) {
                System.out.println("8 марта выходной");
            }
            else if (i % 7 == 0) {
                System.out.println("СБ, " + (i - 1) + " марта выходной");
                System.out.println("ВС " + i + " марта выходной");
            }


            i++;
        }

    }
}
