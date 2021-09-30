package by.epamtc.OlgaKulik.task0103;

public class Logic {
    public static double getRadiusOfInscribedCircle(int areaOfDescribedSquare) {
        return Math.sqrt(areaOfDescribedSquare) / 2;
    }

    public static double getAreaOfInscribedSquare(double radiusOfInscribedCircle) {
        return 2 * radiusOfInscribedCircle * radiusOfInscribedCircle;
    }

    public static double getHowInscribedSquareLessThanDescribed (double areaOfInscribedSquare, double areaOfDescribedSquare) {
        return areaOfDescribedSquare / areaOfInscribedSquare;
    }
}
