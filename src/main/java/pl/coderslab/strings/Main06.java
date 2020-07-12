package pl.coderslab.strings;

public class Main06 {

    public static void main(String[] args) {

        String str = "codersLabxyz";

        String resultString = "";
        for(int i = str.length() - 1; i >=0; i--) {
            resultString = resultString + str.charAt(i);
        }
        System.out.println(resultString);

    }
}
