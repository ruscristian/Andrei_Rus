package tema.sci.n_factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextInt();
        double j = number;
        for(double i = j - 1; i < number && i > 0; i-- ){

            number = j * i;
            j = number;
        }
        System.out.println("Factorial of number is: " + number);
    }
}
