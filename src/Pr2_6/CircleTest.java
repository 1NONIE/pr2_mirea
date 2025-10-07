package Pr2_6;

public class CircleTest {
    public static void main(String[] args) {
        CircleCompare c1 = new CircleCompare(0, 0, 5.0, "red");
        CircleCompare c2 = new CircleCompare(1, 1, 5.0, "blue");
        CircleCompare c3 = new CircleCompare(2, 2, 3.0, "green");

        System.out.println("Окружность 1: " + c1);
        System.out.println("Площадь 1: " + c1.getArea());
        System.out.println("Длина 1: " + c1.getLength());

        System.out.println("\nСравнение c1 и c2 по радиусу: " + c1.compareByRadius(c2));
        System.out.println("Сравнение c1 и c3 по радиусу: " + c1.compareByRadius(c3));
    }
}