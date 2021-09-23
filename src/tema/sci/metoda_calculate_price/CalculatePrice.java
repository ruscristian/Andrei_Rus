package tema.sci.metoda_calculate_price;

import java.util.Scanner;

public class CalculatePrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the base price: ");
        double basePrice = scanner.nextDouble();
        System.out.println("Please enter the VAT percentage(without the '%' sign): ");
        double vat = scanner.nextDouble();

        System.out.println("The VAT price is: " + basePrice / 100 * vat);
        System.out.println("The base price + VAT = " + calculatePrice(basePrice, vat));

    }

    private static double calculatePrice(double basePrice,double vat){

        return basePrice + (basePrice / 100 * vat);

    }

}
