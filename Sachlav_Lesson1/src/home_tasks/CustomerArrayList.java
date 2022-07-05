package home_tasks;

import java.util.ArrayList;
import java.util.Random;

public class CustomerArrayList {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Double> li = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            li.add(rand.nextDouble()*100);

        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double avg = 0;

        for(double i: li){
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
            sum+=i;
        }
        avg = sum/li.size();

        System.out.println("Максимум " + (int)max);
        System.out.println("Минимум " + (int)min);
        System.out.println("Сумма " + (int)sum);
        System.out.println("Среднее " + (int)avg);
        System.out.print("Нечетные ");

        for(double j: li){
            if ((int)j%2 != 0){
                System.out.print((int)j + " ");
            }

        }
    }
}
