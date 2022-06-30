package home_tasks;

public class avgOf {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            count += 1;
        }
        System.out.println(sum / count);
    }
}