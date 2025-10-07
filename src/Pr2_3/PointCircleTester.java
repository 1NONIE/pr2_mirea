package Pr2_3;

public class PointCircleTester {

    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Circle c1 = new Circle(p1, 5.0);

        System.out.println("Точка: " + p1);
        System.out.println("Окружность: " + c1);
        System.out.println("Площадь: " + c1.getArea());
        System.out.println("Длина: " + c1.getLength());

        c1.getCenter().setX(3.0); // Меняем координату X центра
        System.out.println("Центр окружности после изменения X: " + c1.getCenter());
    }
}