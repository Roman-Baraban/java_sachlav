package lesson_03;
import java.util.Scanner;


public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;

        System.out.println("Tell meh ur name");
        name = sc.nextLine();

        System.out.println("Tell meh ur age");
        age = sc.nextInt();





        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }
}
