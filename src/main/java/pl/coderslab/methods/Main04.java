package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {

        String name = "Adam";
        String surname = "Kowalski";
        String nickname = "Kowal";

        String result = createName(name, surname, nickname);

        System.out.println(result);

    }

    public static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
    }

}
