package pl.coderslab.strings;

public class Main02 {

    public static void main(String[] args) {

        String test = "kakasdcoaksdcasokdc";

        System.out.println(charPos(test, 'c'));

    }

    static int charPos(String str, char c) {
        return str.indexOf(c);
    }
}
