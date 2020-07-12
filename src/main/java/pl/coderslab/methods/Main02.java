package pl.coderslab.methods;

public class Main02 {

    public static void main(String[] args) {

        int n = 4;
        int result = square(n);
        System.out.println(result);

    }

    public static int square(int num) {
        int result = num * num;
        return result;
    }
}
