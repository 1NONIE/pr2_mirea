package Pr2_3;

// Класс Point (точка) - базовая сущность
public class Point {
    private double x;
    private double y;

    // Конструктор точки
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры и сеттеры
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Метод toString для точки
    @Override
    public String toString() {
        return "Point[x=" + x + ", y=" + y + "]";
    }
}