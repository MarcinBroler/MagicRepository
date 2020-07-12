package pl.coderslab.strings;

public class Main04 {

    public static void main(String[] args) {

        String test = "CodersLab";
        String search = "ers";

        System.out.println(containsStr(test, search));

    }

    static boolean containsStr(String str, String search){
        return str.contains(search);
    }
}
