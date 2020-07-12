package pl.coderslab.strings;

public class Main07 {

    public static void main(String[] args) {

        String str = "A to kanapa pana kosta";
        str = str.replaceAll(" ", "");
        str = str.toLowerCase();

        for(int i=0; i < str.length() / 2; i++) {
            char firstChar = str.charAt(i);
            char secondChar = str.charAt(str.length() - 1 - i);
            if(firstChar != secondChar) {
                System.out.println("To nie jest palindrom");
                break;
            }
        }


    }
}
