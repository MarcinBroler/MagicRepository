package pl.coderslab.exceptions;


public class Main01 {

    public static void main(String[] args) {

        try {
            int result = factorial(5);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("Program działa dalej, pomimo że pojawil sie wyjatek");

    }

    static int factorial(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Number is negative");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
