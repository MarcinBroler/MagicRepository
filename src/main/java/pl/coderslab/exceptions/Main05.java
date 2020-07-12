package pl.coderslab.exceptions;


public class Main05 {

    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("123");
            System.out.println(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Jestem w finally");
        }

    }

}
