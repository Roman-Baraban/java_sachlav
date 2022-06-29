package home_tasks;

public class MultTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if (i != 1) {
                System.out.println();
            }
            for (int j = 1; j <= 10; j++) {
                System.out.printf(" " + i*j);
            }
        }
    }
}
