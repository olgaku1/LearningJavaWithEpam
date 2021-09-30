package by.epamtc.OlgaKulik.task0108;

import by.epamtc.OlgaKulik.Console;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int x = Console.inputInteger();

        System.out.println("Value of function: " + Logic.getFunctionValue(x));
    }
}
