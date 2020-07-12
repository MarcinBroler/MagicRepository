package pl.coderslab.datainput;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        getInfo();

    }


    public static void getInfo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        String name = scanner.nextLine();

        System.out.println("Podaj wiek");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Wiek musi byc podany w formacie liczbowym");
        }
        int age = scanner.nextInt();

        System.out.println(name + " ma " + age + " lat");

    }

}

















