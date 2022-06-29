package home_tasks;

public class jubilyNumbers {
    public static void main(String[] args) {
        int i = 0;
        while (i<=1000){
            System.out.println(i);
            i+=5;
        }
// Или так
        i = 0;
        while(i<=1000){
            if (i%5==0){
                System.out.println(i);
            }
            i++;

        }

    }
}
