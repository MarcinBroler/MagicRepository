package pl.coderslab.cutstrings;

public class Main03 {

    public static void main(String[] args) {

        String test = "W pliku `Main03.java`:\n" +
                "\n" +
                "1. umieść metodę o sygnaturze `public static int countTokens(String str)`,\n" +
                "2. uzupełnij ciało metody tak, aby zwracała liczbę wyrazów w podanym ciągu znaków.\n" +
                "\n" +
                "Metoda powinna pomijać białe znaki.\n";

        String test2 = " To jest tekst do ";

        System.out.println(countTokens(test2));

    }

    public static int countTokens(String str) {
        return str.trim().split("\\s+").length;
    }

}
