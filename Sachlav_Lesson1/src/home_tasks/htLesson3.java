package home_tasks;

public class htLesson3 {
    public static void main(String[] args) {

        int x = 10, y = 12, z = 3;

        x += y - x++ * z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        z = --x - y * 5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        y /= x +5 % z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        z = x++ + y *5 ;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        x = y - x++ * z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}
