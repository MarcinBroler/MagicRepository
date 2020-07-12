package pl.coderslab.cutstrings;

public class Main01 {

    public static void main(String[] args) {

        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";

        String[] strArray = str.split(" ");

        for(int i=0; i<strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }
}
