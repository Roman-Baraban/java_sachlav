package home_tasks;

import java.util.Arrays;

public class AreArraysEquals {
    public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {1, 2, 3, 4, 5};
    int[] array3 = {1, 1, 1, 1, 1};
    int[] array4 = {1, 1 ,1, 1, 1, 1};

    System.out.println(areArraysEquals1(array1, array2));
    System.out.println(areArraysEquals1(array1, array3));
    System.out.println(areArraysEquals1(array1, array4));

    System.out.println(areArraysEquals2(array1, array2));
    System.out.println(areArraysEquals2(array1, array3));
    System.out.println(areArraysEquals2(array1, array4));

    }

    public static boolean areArraysEquals1(int[] a, int[] b) {
    return Arrays.equals(a, b);
    }

    public static boolean areArraysEquals2(int[] a, int[] b) {
        int lenght1 = 0;
        int lenght2 = 0;
        boolean lenghtEquals = false;

        for (int i: a){
            lenght1++;
        }
        for (int i: a){
            lenght2++;
        }
        if (lenght1==lenght2){
            lenghtEquals = true;
        }

        boolean valuesEquals = true;

        if (lenghtEquals==true){   //Запускаем, только если длины равны
            for (int i = 0; i < lenght1; i++){
                if (a[i] != b[i]){
                    valuesEquals = false;
                    break;
                }
            }
        }
        if (lenghtEquals==true && valuesEquals==true){
            return true;
        } else {
            return false;
        }
        }

}