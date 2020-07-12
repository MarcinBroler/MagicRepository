package pl.coderslab.methods;

public class Main01 {

    public static void main(String[] args) {
        int x = 6;
        int y = 9;

        int res = multiply(x, y);

        System.out.println(res);

    }

    public static int multiply(int multiplier, int index) {
        int result = multiplier * index;
        return result;
    }




}
