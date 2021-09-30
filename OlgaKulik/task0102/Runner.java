package by.epamtc.OlgaKulik.task0102;

import by.epamtc.OlgaKulik.Console;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        int year = Console.inputInteger();

        System.out.println("Enter the month: ");
        int month = Console.inputInteger();

        System.out.println("Number of days in a given month: " + Logic.getNumberOfDaysInMonth(month, year));
    }
}
