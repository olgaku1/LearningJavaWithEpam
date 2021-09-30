package by.epamtc.OlgaKulik.task0108;

public class Logic {
    public static double getFunctionValue(int x) {
        double function;
        if (x>=3) {
            function = - x * x + 3 * x + 9;
        } else {
            function = 1 / (Math.pow(x, 3) - 6);
        }
        return function;
    }
}
