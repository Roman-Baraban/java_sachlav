package home_tasks;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "liza";
        String password = "podliza";

        System.out.println("Введите логин");
        String login_in = sc.nextLine();
        while (login_in.equals(login) == false) {
            System.out.println("Нет пользователя с таким именем. Попробуйте еще раз.");
            login_in = sc.nextLine();
        }
        System.out.println("Введите пароль");
        String pass_in = sc.nextLine();
        while (pass_in.equals(password) == false) {
            System.out.println("Вы ввели неверный пароль. Попробуйте еще раз.");
            pass_in = sc.nextLine();
        }
        System.out.println("Здравствуйте, " + login + ", Вы вошли в систему");
    }
}