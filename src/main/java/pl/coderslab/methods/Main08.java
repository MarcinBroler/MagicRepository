package pl.coderslab.methods;

public class Main08 {

    public static void main(String[] args) {

        int a = 135;
        int b = 70;
        int c = 12;

        int result = maxOfThree(a, b, c);

        System.out.println(result);


    }

    public static int maxOfThree(int a, int b, int c) {

        if(a > b && a > c) {
            return a;
        } else if(b > c) {
            return b;
        } else {
            return c;
        }

    }

}
