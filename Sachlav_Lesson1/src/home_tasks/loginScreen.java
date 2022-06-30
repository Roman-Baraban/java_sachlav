package home_tasks;

import java.util.Scanner;

public class loginScreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String un = "lizapolina";  //<<<<<<<<<<<<<<<<<LOGIN
        String pass = "twicepupik";  //<<<<<<<<<<<<<<<PASSWORD
        String unin = "";
        String passin = "";
        int passcounter = 0;

        while (unin.equals(un)==false){
            System.out.println("Введите логин");
            unin = sc.nextLine();
            if (unin.equals(un)==true){
                System.out.println("Рады видеть Вас снова, " + un);
                break;
            }
            System.out.println("Пользователя с таким именем не существует");
        }

        boolean flag = false;

        System.out.println("Введите Ваш пароль, будьте так любезны.");
        passin = sc.nextLine();
        if (passin.equals(pass)==true){
            flag = true;
            System.out.println("Верный пароль. Добро пожаловать в BatYamskInc.");
        }

        while (true){
            passcounter+=1;
            if (passcounter==5){
                System.out.println("Превышено максимальное количество попыток ввода пароля. Надо было на бумажке записать что-ли.");
                break;
            }
            if (passin.equals(pass)==true && flag == false){
                System.out.println("Верный пароль. Добро пожаловать в BatYamskInc.");
                break;
            }
            System.out.println("Неверный пароль. Еще разок?");
            passin = sc.nextLine();


        }

    }
}
