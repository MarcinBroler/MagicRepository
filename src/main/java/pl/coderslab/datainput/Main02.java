package pl.coderslab.datainput;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        operations();

    }

    public static void operations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Podaj poprawna liczbe");
        }
        int first  = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Podaj poprawna liczbe");
        }
        int second  = scanner.nextInt();

        System.out.println("Dodawanie " + (first + second));
        System.out.println("Odejmowanie " + (first - second));
        System.out.println("Mnożenie " + (first * second));
        System.out.println("Dzielenie " + (first / second));
    }

}
