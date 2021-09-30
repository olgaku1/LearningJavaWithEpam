package by.epamtc.OlgaKulik.task0110;

public class Logic {
    public static String getTableOfArgumentsAndFunction (int a, int b, int h) {
        double F = 0;
        String table = "";
        for (int i = a; i <= b; i+=h) {
            F = i / Math.tan(i);
            table = table + i + "\t" + F + "\n";
        }
        return table;
    }
}
