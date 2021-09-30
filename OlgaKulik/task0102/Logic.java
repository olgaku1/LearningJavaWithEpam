package by.epamtc.OlgaKulik.task0102;

public class Logic {
    public static int getNumberOfDaysInMonth(int month, int year) {
        int numberOfDaysInMonth = 0;
        if (isLeapYear(year)) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    numberOfDaysInMonth = 29;
                    break;
                case 4, 6, 9, 11:
                    numberOfDaysInMonth = 30;
                    break;
            }
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    numberOfDaysInMonth = 28;
                    break;
                case 4, 6, 9, 11:
                    numberOfDaysInMonth = 30;
                    break;
            }
        }
        return numberOfDaysInMonth;
    }

    public static boolean isLeapYear (int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
