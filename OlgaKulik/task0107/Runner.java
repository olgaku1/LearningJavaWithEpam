package by.epamtc.OlgaKulik.task0107;

import by.epamtc.OlgaKulik.Console;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the coordinate x1: ");
        int x1 = Console.inputInteger();
        System.out.println("Enter the coordinate y1: ");
        int y1 = Console.inputInteger();
        System.out.println("Enter the coordinate x2: ");
        int x2 = Console.inputInteger();
        System.out.println("Enter the coordinate y2: ");
        int y2 = Console.inputInteger();

        System.out.println("Which coordinate is closer to the origin? "
                + Logic.getCoordinateCloserToStart(x1, y1, x2, y2));
    }
}
