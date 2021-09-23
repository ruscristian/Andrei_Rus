package tema.sci.n_factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = scanner.nextInt();
        System.out.println("Factorial of number is(normal method): " + normalFormula(number));
        System.out.println("Factorial of number is(recursive method): " + recursiveFormula(number));
    }

    private static long normalFormula(long number) {
        if (number == 0){
            return 1;
        } else {
            long j = number;
            for (long i = j - 1; i < number && i > 0; i--) {

                number = j * i;
                j = number;
            }

            return number;
        }
    }

    private static long recursiveFormula(long n){

        if (n == 1 || n == 0){
            return 1;
        } else {
            return (n * (recursiveFormula(n-1)));
        }

    }
}
