package lesson_03_01;

import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Numbah 1");
                break;
            case 2:
                System.out.println("Numbah 2");
                break;
            case 3:
                System.out.println("Numbah 3");
                break;
            case 4:
                System.out.println("Numbah 4");
                break;
            case 5:
                System.out.println("Numbah 5");
                break;
        }
    }
}
