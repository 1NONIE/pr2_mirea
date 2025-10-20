package Pr2_4;
import java.util.Scanner;
// Класс для тестирования магазина
public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создаем магазин на 5 компьютеров
        Shop shop = new Shop(5);

        // Добавим несколько компьютеров вручную
        Computer comp1 = new Computer("Dell", "XPS 13", 1200.0);
        Computer comp2 = new Computer("Apple", "MacBook Air", 1100.0);
        shop.addComputer(comp1);
        shop.addComputer(comp2);

        System.out.println("Начальное состояние магазина:");
        shop.printShop();

        // Поиск
        System.out.println("\nПоиск компьютера Dell XPS 13:");
        Computer foundComp = shop.findComputer("Dell", "XPS 13");
        if (foundComp != null) {
            System.out.println("Найден: " + foundComp);
        } else {
            System.out.println("Компьютер не найден.");
        }

        // Удаление
        shop.removeComputer(comp1);
        System.out.println("\nПосле удаления Dell XPS 13:");
        shop.printShop();

        // Ввод с клавиатуры
        System.out.println("\n--- Интерфейс добавления ---");
        System.out.print("Введите бренд: ");
        String brand = scanner.nextLine(); // считываем строку
        System.out.print("Введите модель: ");
        String model = scanner.nextLine();
        System.out.print("Введите цену: ");
        double price = scanner.nextDouble(); // считываем число
        scanner.nextLine(); // *** ВАЖНО! *** Очищаем буфер после nextDouble,
        // иначе следующий nextLine() возьмет оставшуюся строку

        // Создаем новый компьютер из ввода
        Computer userComp = new Computer(brand, model, price);
        // Добавляем его в магазин
        shop.addComputer(userComp);

        System.out.println("\nФинальное состояние магазина:");
        shop.printShop();

        // Закрываем Scanner
        scanner.close();
    }
}