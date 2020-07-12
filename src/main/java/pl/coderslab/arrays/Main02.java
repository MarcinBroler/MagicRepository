package pl.coderslab.arrays;


import java.util.Arrays;
import java.util.Random;

public class Main02 {


    public static void main(String[] args) {

        Random random = new Random();
        int[] randNumbers = new int[20];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< randNumbers.length; i++) {
            int r = random.nextInt(101);
            if(r < min) {
                min = r;
            }
            randNumbers[i] = r;
        }
        System.out.println("Tablica: " + Arrays.toString(randNumbers));
        System.out.println("Min: " + min);

    }
}
