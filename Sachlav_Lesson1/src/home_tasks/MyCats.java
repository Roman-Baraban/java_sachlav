package home_tasks;

import java.util.ArrayList;

public class MyCats {
    public static void main(String[] args) {
        ArrayList<Cat> catsList = new ArrayList<Cat>();

        catsList.add(new Cat("Бильбо","Черный", 10));
        catsList.add(new Cat("Фродо","Белый", 11));
        catsList.add(new Cat("Сэм","Серый", 12));
        catsList.add(new Cat("Мэрри","Рыжий", 13));
        catsList.add(new Cat("Пиппин","Зеленый", 14));

        for (Cat i: catsList){
            System.out.println(i.toString());
        }
    }
}
