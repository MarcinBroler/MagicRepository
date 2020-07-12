package pl.coderslab.datainput;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

        rowsColumns();

    }

    public static void rowsColumns() {
        Scanner scanner = new Scanner(System.in);
        int rows = readInt(scanner);
        int cols = readInt(scanner);
        int tab[][] = new int[rows][cols];
        int numbers = 1;
        int sum = 0, counter = 0;
        for(int i = 0 ; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                tab[i][j] = numbers;
                sum += numbers;
                counter++;
                numbers++;
            }
        }
        System.out.println("Suma " + sum);
        System.out.println("Ilość: " + counter);

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
