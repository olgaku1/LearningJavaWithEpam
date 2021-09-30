package by.epamtc.OlgaKulik.task0106;

import by.epamtc.OlgaKulik.Console;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the time: ");
        int time = Console.inputInteger();
        int hours = Logic.getCompleteHours(time);
        int minutes = Logic.getCompleteMinutes(time);
        int seconds = Logic.getRemainingSeconds(time);

        System.out.println("Time elapsed since the beginning of the day: "
                + hours + " h " + minutes + " min " + seconds + " sec.");
    }
}
