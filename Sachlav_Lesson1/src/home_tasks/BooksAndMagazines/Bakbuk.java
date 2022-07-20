package home_tasks.BooksAndMagazines;

import java.util.ArrayList;

public class Bakbuk {
    public static void main(String[] args) {
        ArrayList<Printable> listOfAll = new ArrayList<>();

        Printable book1 = new Book("50 оттенков серого");
        Printable book2 = new Book("50 оттенков голубого");

        Printable magazine1 = new Magazine("Молоток");
        Printable magazine2 = new Magazine("Котолом");

        listOfAll.add(book1);
        listOfAll.add(book2);
        listOfAll.add(magazine1);
        listOfAll.add(magazine2);

        listOfAll.forEach(x -> x.print());




    }
}
