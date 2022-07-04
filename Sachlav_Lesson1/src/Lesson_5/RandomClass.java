package Lesson_5;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int randInt = random.nextInt(100);
        System.out.println("randInt = " + randInt);

        double randDouble = random.nextDouble();
        System.out.println("randDouble = " + randDouble);

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        }

        }

