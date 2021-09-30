package by.epamtc.OlgaKulik.task0101;

import by.epamtc.OlgaKulik.Console;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        int number = Console.inputInteger();
        int lastDigit = Logic.getLastDigit(number);
        int squareOfLastDigit = Logic.getSquareOfNumber(lastDigit);
        System.out.println("Last digit of the square of the entered number: " + Logic.getLastDigit(squareOfLastDigit));
    }
}
