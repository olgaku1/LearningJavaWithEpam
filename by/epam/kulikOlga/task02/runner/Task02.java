package by.epam.kulikOlga.task02.runner;

import by.epam.kulikOlga.task02.entity.Ball;
import by.epam.kulikOlga.task02.entity.Basket;

import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>();

        balls.add(new Ball(0.3, "Blue"));
        balls.add(new Ball(0.6, "Red"));
        balls.add(new Ball(0.1, "Blue"));
        balls.add(new Ball(0.25, "Green"));
        balls.add(new Ball(0.2, "Red"));

        Basket basket = new Basket(balls);

        System.out.println("The weight of the balls in the basket: " + basket.countTotalWeight(balls));
        System.out.println("Number of blue balls in the basket: " + basket.countBlueBalls());
    }
}
