package Pr2_2;

// Класс Ball (мяч) - позиция на плоскости
public class Ball {
    // Координаты мяча
    private double x;
    private double y;

    // Конструктор - задаем начальные координаты
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Сеттеры - можно изменить координаты
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Метод, чтобы задать обе координаты сразу
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод, чтобы "двигать" мяч на заданное расстояние
    public void move(double xDisp, double yDisp) {
        // xDisp - смещение по X, yDisp - смещение по Y
        this.x += xDisp; // прибавляем смещение к текущей координате X
        this.y += yDisp; // прибавляем смещение к текущей координате Y
    }

    // Метод toString для вывода информации
    @Override
    public String toString() {
        return "Ball[x=" + x + ", y=" + y + "]";
    }
}