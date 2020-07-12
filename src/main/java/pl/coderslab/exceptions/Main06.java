package pl.coderslab.exceptions;


public class Main06 {

    public static void main(String[] args) {

        try {
            int result = divide(30,0);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    static int divide (int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("b is 0");
        }
        return a/b;
    }

}
