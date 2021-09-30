package by.epamtc.OlgaKulik.task0105;

import by.epamtc.OlgaKulik.Console;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int number = Console.inputInteger();

        System.out.println("Is it true that given number is perfect? " + Logic.isPerfectNumber(number));
    }
}
