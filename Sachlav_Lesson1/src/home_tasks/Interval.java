package home_tasks;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число от 0 до 100");
        int num = sc.nextInt();
        int counter = 0;
        while (num < 0 || num > 100) {
            counter+=1;
            System.out.println("Читай внимательней");
            System.out.println("ОТ ОДНОГО ДО СТА!");
            System.out.println("Попробуй еще.");
            if (counter==3){
                System.out.println("Всё с тобой понятно. До свидания.");
                break;
            }
            num = sc.nextInt();
        }
        if (num >= 0 && num <= 14) {
            System.out.println("Это число от 0 до 14");
        } else if (num >= 15 && num <= 35) {
            System.out.println("Это число от 15 до 35");
        } else if (num >= 36 && num <= 50) {
            System.out.println("Это число от 36 до 50");
        } else if (num >= 51 && num <= 100) {
            System.out.println("Это число от 51 до 100");
        }
    }
}