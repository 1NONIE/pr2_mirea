package Pr2_3;
public class PointCircleTester {
    public static void main(String[] args) {
        // Создаем точку
        Point p1 = new Point(1.0, 2.0);
        // Создаем окружность с центром в точке p1
        Circle c1 = new Circle(p1, 5.0);

        // Выводим информацию
        System.out.println("Точка: " + p1);
        System.out.println("Окружность: " + c1);
        System.out.println("Площадь: " + c1.getArea());
        System.out.println("Длина: " + c1.getLength());

        // Меняем координату X у центра окружности
        // c1.getCenter() возвращает объект Point
        // .setX(...) вызывает метод сеттер у этого объекта Point
        // т.к. c1.center и p1 указывают на один и тот же объект Point,
        // то изменение через c1 меняет и p1
        c1.getCenter().setX(3.0);
        System.out.println("Центр окружности после изменения X: " + c1.getCenter());
        System.out.println("Объект p1 тоже изменился: " + p1);
    }
}