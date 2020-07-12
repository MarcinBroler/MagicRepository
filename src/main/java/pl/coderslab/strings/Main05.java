package pl.coderslab.strings;

public class Main05 {

    public static void main(String[] args) {

        String[] testArray = { "Coders", "Lab", "Java" };

        System.out.println(stringFromArray(testArray));

    }

    static String stringFromArray(String[] str){
        return String.join(" ", str);
    }
}
