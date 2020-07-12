package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {

        int age = 15;

        boolean result = checkMaturity(age);

        System.out.println(result);

    }

    public static boolean checkMaturity(int age) {
        if(age < 18) {
            return false;
        } else {
            return true;
        }
    }

}
