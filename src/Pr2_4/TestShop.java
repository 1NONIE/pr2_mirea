package Pr2_4;

        import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop(5); // Максимум 5 компьютеров

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
        String brand = scanner.nextLine();
        System.out.print("Введите модель: ");
        String model = scanner.nextLine();
        System.out.print("Введите цену: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера

        Computer userComp = new Computer(brand, model, price);
        shop.addComputer(userComp);

        System.out.println("\nФинальное состояние магазина:");
        shop.printShop();

        scanner.close();
    }
}