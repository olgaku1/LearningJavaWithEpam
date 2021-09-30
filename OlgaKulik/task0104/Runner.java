package by.epamtc.OlgaKulik.task0104;

import by.epamtc.OlgaKulik.Console;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter four numbers: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            numbers.add(Console.inputInteger());
        }

        int quantityOfEvenNumbers = Logic.quantityOfEvenNumbers(numbers);

        System.out.println("Is it true that least two numbers are even? " + Logic.isLeast2EvenNumbers(quantityOfEvenNumbers));
    }
}
