package by.epamtc.OlgaKulik;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputInteger() {
        int number;
        do {
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please, enter only positive integers");
                number = Integer.MIN_VALUE;
                scanner.next();
            }
        } while (number <= 0);
        return number;
    }
}
