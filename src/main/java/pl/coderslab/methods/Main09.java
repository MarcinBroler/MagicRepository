package pl.coderslab.methods;

public class Main09 {

    public static void main(String[] args) {

        int n = 5;

        int result = factorial(n);

        System.out.println(result);

    }

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
