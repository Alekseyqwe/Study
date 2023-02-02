package org.example.first_lesson;

public class HomeworkTest {public static void main(String[] args){
    int i = 1;
    while (i <= 31){
        if (i % 7 == 0) {
            if (i - 6 == 8){
                System.out.println("ПН, 8 марта выходной");
            }
            else{
                System.out.println("ПН, " + (i - 6) + " марта, будний");
            }

            System.out.println("ВТ, " + (i - 5) + " марта, будний");
            System.out.println("СР, " + (i - 4) + " марта, будний");
            System.out.println("ЧТ, " + (i - 3) + " марта, будний");
            System.out.println("ПТ, " + (i - 2) + " марта, будний");
            System.out.println("СБ, " + (i - 1) + " марта выходной");
            System.out.println("ВС " + i + " марта выходной");

        }


        i++;
    }

}
}
