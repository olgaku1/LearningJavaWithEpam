package by.epamtc.OlgaKulik.task0104;

import java.util.ArrayList;

public class Logic {
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static int quantityOfEvenNumbers(ArrayList<Integer> numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (isEven(number)) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isLeast2EvenNumbers(int quantityOfEvenNumbers) {
        return (quantityOfEvenNumbers >= 2);
    }
}
