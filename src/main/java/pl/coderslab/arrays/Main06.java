package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main06 {

    public static void main(String[] args) {
        //int[] numbers = {2, 3};
        //int[] secondNumbers = {2, 4};

        Random random = new Random();
        int[] numbers = new int[10];
        int[] secondNumbers = new int[10];
        for(int i=0; i< numbers.length; i++) {
            numbers[i] = random.nextInt(11);
            secondNumbers[i] = random.nextInt(11);
        }
        int[] resultTab = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            resultTab[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(secondNumbers));
        System.out.println(Arrays.toString(resultTab));

    }
}
