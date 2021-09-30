package by.epamtc.OlgaKulik.task0107;

public class Logic {
    public static String getCoordinateCloserToStart(int x1, int y1, int x2, int y2) {
        String nearCoordinate;
        if (Math.sqrt((y1 * y1) + (x1 * x1)) < Math.sqrt((y2 * y2) + (x2 * x2))) {
            nearCoordinate = x1 + ", " + y1;
        } else {
            nearCoordinate = x2 + ", " + y2;
        }
        return nearCoordinate;
    }
}
