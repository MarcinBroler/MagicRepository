package pl.coderslab.methods;

public class Main03 {

    public static void main(String[] args) {

        double pln = 16.54;

        double result = convertToUsd(pln);
        double resultWithPrecision = convertToUsdWithPrecision(pln);

        System.out.println(result);
        System.out.println(resultWithPrecision);


    }

    public static double convertToUsd(double pln) {
        double result = pln * 4.04;
        return result;
    }

    public static double convertToUsdWithPrecision(double pln) {
        double result = (int)((pln * 4.04) * 100)/ 100.0;
        return result;
    }

}
