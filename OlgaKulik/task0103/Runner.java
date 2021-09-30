package by.epamtc.OlgaKulik.task0103;

import by.epamtc.OlgaKulik.Console;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the area of described square: ");
        int areaOfDescribedSquare = Console.inputInteger();

        double radiusOfInscribedCircle = Logic.getRadiusOfInscribedCircle(areaOfDescribedSquare);
        double areaOfInscribedSquare = Logic.getAreaOfInscribedSquare(radiusOfInscribedCircle);

        System.out.println("How many times is the area of the inscribed square less than the area of described square? "
                + Logic.getHowInscribedSquareLessThanDescribed(areaOfInscribedSquare, areaOfDescribedSquare));
    }
}
