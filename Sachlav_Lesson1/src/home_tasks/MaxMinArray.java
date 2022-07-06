package home_tasks;

import java.util.Random;

public class MaxMinArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(minFromArray(arr));
        System.out.println(maxFromArray(arr));
        System.out.println(avgFromArray(arr));
        allthree(arr);
    }
    public static int minFromArray(int[] li){
    int max = li[0];
    for(int i: li){
        if (i>max){
            max=i;
        }
    }
    return max;
    }
    public static int maxFromArray(int[] li){
        int min = li[0];
        for(int i: li){
            if (i<min){
                min=i;
            }
        }
        return min;

    }
    public static int avgFromArray(int[] li){
        int sum = 0;
        for(int i: li){
            sum+=i;
        }
        return sum/li.length;
    }
    public static void allthree(int[] lili){
        System.out.println(maxFromArray(lili));
        System.out.println(minFromArray(lili));
        System.out.println(avgFromArray(lili));

    }
}
