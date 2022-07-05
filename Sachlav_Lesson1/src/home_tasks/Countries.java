package home_tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        map.put("Москва", "неРоссия");
        map.put("Саратов", "Россия");
        map.put("Мытищи", "почтиМосква");
        map.put("Бат-ям", "почтиМытищи");
        map.put("Ленинград", "едятШаверму");

        System.out.println(map.values()); //все значение

        map.forEach((k,v)-> System.out.println(k + "-" +v));  //ключ-значение

        System.out.println();
        System.out.println("Угадай, какой город есть в нашем словаре:");  //угадайка
        String keyin = sc.nextLine();

        if (map.containsKey(keyin)){
            System.out.println("Угадал. А страну угадаешь?");
        } else {
            System.out.println("Мимо. А страну угадаешь?");
        }
        String valuein = sc.nextLine();
        if (map.containsValue(valuein)){
            System.out.println("Точно в дырочку! Орёл!");
        } else {
            System.out.println("Нде");
        }


    }
}
