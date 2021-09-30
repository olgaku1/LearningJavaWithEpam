package by.epamtc.OlgaKulik.task0106;

public class Logic {
    public static int getCompleteHours(int time) {
        return time / 3600;
    }

    public static int getCompleteMinutes(int time) {
        return time % 3600 / 60;
    }

    public static int getRemainingSeconds(int time) {
        return time % 3600 % 60;
    }
}
