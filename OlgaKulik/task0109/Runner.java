package by.epamtc.OlgaKulik.task0109;

import by.epamtc.OlgaKulik.Console;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Enter the radius: ");
        int radius = Console.inputInteger();

        System.out.println("Area of a circle: " + Logic.getAreaOfCircle(radius));
        System.out.println("Circumference: " + Logic.getCircumference(radius));
    }
}
