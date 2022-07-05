package Lesson_5.collections;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(111, "Pupik1");
        students.put(222, "Pupik2");
        students.put(333, "Pupik3");
        students.put(444, "Pupik4");

        System.out.println(students.get(111));
        System.out.println(students.containsKey(111));
        System.out.println(students.containsValue("Pupik3"));




    }
}
