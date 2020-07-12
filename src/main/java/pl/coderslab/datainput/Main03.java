package pl.coderslab.datainput;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        getData();

    }

    public static void getData() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int input;

        do {
            input = readInt(scanner);
            sum += input;
            if(input != 0) {
                counter++;
            }
        } while (input != 0);

        System.out.println("Suma: " + sum);
        System.out.println("Liczba: " + counter);
    }

    public static int readInt(Scanner scanner) {
        System.out.println("Podaj liczbe");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Podaj poprawna liczbe");
        }
        return scanner.nextInt();
    }

}
