package home_tasks;

import java.util.Scanner;

public class WorkersBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какая у тебя зарплата?");
        int salary = sc.nextInt();
        System.out.println("Ндееееее");
        System.out.println("А работаешь давно?");
        int exp = sc.nextInt();
        System.out.println("Ндееееееееееее");
        double bonus;
        if (exp<5){
            bonus = salary*0.1;
        } else if (exp>=5 && exp<10) {
            bonus = salary*0.15;
        } else if (exp>=10 && exp<15) {
            bonus = salary*0.25;
        } else if (exp>=15 && exp<20) {
            bonus = salary*0.35;
        } else if (exp>=20 && exp<25) {
            bonus = salary*0.45;
        } else {
            bonus = salary*0.5;
        }
        System.out.println("В конце года получишь " + bonus + " рубликов");
    }
}
