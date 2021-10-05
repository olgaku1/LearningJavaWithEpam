package by.epamtc.OlgaKulik.task02.entity;


public class Ball {
    private double weight;
    private String color;

    public Ball() {
    }

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Ball ball = (Ball) obj;
        if (weight != ball.weight) {
            return false;
        }
        if (null == color) {
            return (color == ball.color);
        }
        else {
            if (!color.equals(ball.color)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int factor = 31;
        return (int) (factor * weight +
                ((null == color) ? 0 : color.hashCode()));

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{weight=" + weight +
                ", color='" + color + '}';
    }
}
