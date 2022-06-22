package lesson_03_01;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        while (n<1 || n>7) {

            System.out.println("Вводи число");

            n = sc.nextInt();
            if ((n < 1) || (n > 7)){
                System.out.println("Лукавишь");
            }
        }

        switch (n) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Наконец то суббота");
                break;
            case 7:
                System.out.println("Завтра на работу");
                break;
        }
    }
}
