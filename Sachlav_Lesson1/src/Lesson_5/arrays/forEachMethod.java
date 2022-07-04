package Lesson_5.arrays;

public class forEachMethod {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Loop 1");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Loop 2");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + 5 + " ");

        }

        System.out.println();

        for (int pupik : array) {
            System.out.println(pupik);
        }
    }
}
