package home_tasks;

import java.util.ArrayList;
import java.util.Random;

public class threeCollections {
    public static void main(String[] args) {
        ArrayList<Integer> li1 = new ArrayList<>();
        ArrayList<String> li2 = new ArrayList<>();
        ArrayList<String> li3 = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            li1.add(rand.nextInt(100));
         }
        for (int i = 0; i < 10; i++) {
            li2.add(""+rand.nextInt(100));
        }
        for (int i = 0; i < 10; i++) {
            li3.add(li1.get(i)+"-"+li2.get(i));
        }
        for (String i: li3){
            System.out.print(i + " ");
        }
}
}