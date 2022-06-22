package lesson_03_01;

public class compareText {
    public static void main(String[] args) {
        String name = "Roman";
        String otherName = "Roman";
        String oneMoreName = "Baraban";
        String plsOneMoreName = "roman";

        boolean areEqual = name.equals(otherName);
        System.out.println(areEqual);
        System.out.println(name.equals(oneMoreName));
        System.out.println(name.equalsIgnoreCase(plsOneMoreName));
    }
}
