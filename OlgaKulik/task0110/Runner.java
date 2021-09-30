package by.epamtc.OlgaKulik.task0110;

import by.epamtc.OlgaKulik.Console;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a = Console.inputInteger();
        System.out.println("Enter b: ");
        int b = Console.inputInteger();
        System.out.println("Enter h: ");
        int h = Console.inputInteger();

        System.out.println("x\tF(x)=tg(x)\n" + Logic.getTableOfArgumentsAndFunction(a, b, h));
    }
}
