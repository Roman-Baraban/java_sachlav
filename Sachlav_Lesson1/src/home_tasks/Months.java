package home_tasks;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи число от 1 до 12");
        int n = sc.nextInt();


        while (n < 1 || n > 12) {
            System.out.println("Это не число от 1 до 12, попробуй еще раз");
            n = sc.nextInt();
        }

        switch (n) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ну я же просил - от 1 до 12");


        }


    }
}
