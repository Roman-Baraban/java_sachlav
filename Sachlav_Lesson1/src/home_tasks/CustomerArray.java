package home_tasks;

import java.util.Random;

public class CustomerArray {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble()*100;

        }
        //double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double avg = 0;

        for(double i: arr){
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
            sum+=i;
        }
        avg = sum/arr.length;

        System.out.println("Максимум " + (int)max);
        System.out.println("Минимум " + (int)min);
        System.out.println("Сумма " + (int)sum);
        System.out.println("Среднее " + (int)avg);
        System.out.print("Нечетные ");

        for(double j: arr){
            if ((int)j%2 != 0){
                System.out.print((int)j + " ");
            }

        }




    }
}
