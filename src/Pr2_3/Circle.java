package Pr2_3;

// Класс Circle - теперь центр это объект Point
public class Circle {
    // Вот это поле - это объект Point, т.е. центр окружности
    private Point center;
    private double radius; // а вот это радиус, как раньше

    // Конструктор - принимает центр (Point) и радиус
    public Circle(Point center, double radius) {
        this.center = center; // сохраняем объект Point как центр
        this.radius = radius;
    }

    // Геттеры и сеттеры
    public Point getCenter() {
        return center; // возвращаем объект Point
    }

    public void setCenter(Point center) {
        this.center = center; // устанавливаем новый объект Point как центр
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Методы вычисления
    public double getArea() {
        return Math.PI * radius * radius; // площадь
    }

    public double getLength() {
        return 2 * Math.PI * radius; // длина
    }

    // Метод toString
    @Override
    public String toString() {
        // Выводим информацию о центре (Point) и радиусе
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }
}