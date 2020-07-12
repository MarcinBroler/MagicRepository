package pl.coderslab.cutstrings;

import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {

        String test = "Java-zadania-podzial-napisow";

        System.out.println(Arrays.toString(onlyTwoElements(test, '-')));
    }

    public static String[] onlyTwoElements(String str, char separator) {
        return str.split(Character.toString(separator), 2);
    }

}
