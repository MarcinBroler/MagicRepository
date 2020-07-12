package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        File file = new File("text3.txt");
        double sum = 0;
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()){
                // w tmy miejscu dostaje pojedyncza linie w zmiennej line
                String line = scanner.nextLine();
                String[] splittedValues = line.split(", ");
                for(String value : splittedValues) {
                    try {
                        double number = Double.parseDouble(value);
                        sum += number;
                    } catch (NumberFormatException e) {
                        System.out.println("Niepoprawna liczba");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Wynik: " + sum);
    }