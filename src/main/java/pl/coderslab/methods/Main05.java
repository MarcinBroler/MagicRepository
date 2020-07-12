package pl.coderslab.methods;

public class Main05 {

    public static void main(String[] args) {

        double gross = 123;
        double vat = 0.08;

        double result = calculateNetto(gross, vat);

        System.out.println(result);


    }

    public static double calculateNetto(double gross, double vat) {
        double readyVatToCount = vat + 1;
        double result = gross / readyVatToCount;
        return result;
    }



}
