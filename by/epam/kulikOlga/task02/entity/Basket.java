package by.epam.kulikOlga.task02.entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;
    private double weight;

    public Basket(ArrayList<Ball> balls) {
        this.balls = new ArrayList<>();
        for (Ball ball: balls) {
            add(ball);
        }
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void add(Ball newBall) {
        this.balls.add(newBall);
    }

    public double countTotalWeight(ArrayList<Ball> balls) {
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int countBlueBalls() {
        int numOfBlueBalls = 0;
        for (Ball  ball: balls)
        {
            if (ball.getColor().equals("Blue"))
                numOfBlueBalls++;
        }
        return numOfBlueBalls;
    }
}
