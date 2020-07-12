package pl.coderslab.strings;

public class Main08 {

    public static void main(String[] args) {

        String test = "KajAK";

        System.out.println(toggleChar(test));

    }

    static String toggleChar(String str) {
        String resultString = "";
        for(char ch : str.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                resultString = resultString + Character.toUpperCase(ch);
            } else {
                resultString = resultString + Character.toLowerCase(ch);
            }
        }
        return resultString;
    }
}
