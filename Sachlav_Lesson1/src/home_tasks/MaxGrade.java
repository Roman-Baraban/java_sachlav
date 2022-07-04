package home_tasks;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxGrade {
    public static void main(String[] args) {

        int[] scores = {1, 2, 3, 4, 5};
        String[] students = {"Биба", "Боба", "Лёлик", "Болик", "Пупик"};
        int maxScore = -1;
        int maxIndex = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>maxScore){
                maxScore = scores[i];
                maxIndex = i;
            }
        }
        System.out.println(students[maxIndex]);
        System.out.println(maxScore);




    }
}
