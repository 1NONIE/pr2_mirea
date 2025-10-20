package Pr2_6;
// Класс Circle - с методом сравнения
public class CircleCompare {
    // Поля
    private double x, y, r;
    private String colour;

    // Конструктор
    public CircleCompare(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    // Геттер для радиуса - нужен для сравнения
    public double getR() {
        return r;
    }

    // Методы вычисления
    public double getArea() {
        return Math.PI * r * r;
    }

    public double getLength() {
        return 2 * Math.PI * r;
    }

    // Метод сравнения по радиусу
    public boolean compareByRadius(CircleCompare other) {
        // Проверка, чтобы не было ошибки, если передали null
        if (other == null) return false;
        // Сравниваем радиусы текущего объекта (this.r) и другого (other.getR())
        return this.r == other.getR();
    }

    // Метод toString
    @Override
    public String toString() {
        return "CircleCompare[r=" + r + ", colour=" + colour + "]";
    }
}