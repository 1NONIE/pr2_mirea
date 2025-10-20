package Pr2_4;

// Класс Shop (магазин) - хранилище компьютеров
public class Shop {
    // Массив для хранения объектов Computer
    private Computer[] computers;
    // Переменная, чтобы отслеживать, сколько компов уже добавлено
    private int count;

    // Конструктор магазина - задаем максимальное количество компьютеров
    public Shop(int maxSize) {
        this.computers = new Computer[maxSize]; // создаем массив фиксированного размера
        this.count = 0; // пока что ничего не добавлено
    }

    // Метод добавления компьютера
    public void addComputer(Computer comp) {
        // Проверяем, есть ли место
        if (count < computers.length) {
            // Добавляем компьютер в следующую свободную ячейку
            computers[count] = comp;
            count++; // увеличиваем счётчик
            System.out.println("Компьютер добавлен.");
        } else {
            System.out.println("Магазин полон, невозможно добавить компьютер.");
        }
    }

    // Метод удаления компьютера
    public void removeComputer(Computer comp) {
        // Ищем индекс компьютера в массиве
        int index = -1; // индекс не найден
        for (int i = 0; i < count; i++) {
            // Сравниваем по ссылке (это не совсем правильно для "логического" удаления,
            // но подходит для этого задания)
            if (computers[i] == comp) {
                index = i; // нашли индекс
                break; // выходим из цикла
            }
        }
        // Если нашли
        if (index != -1) {
            // Сдвигаем все элементы после найденного на одну позицию влево
            for (int i = index; i < count - 1; i++) {
                computers[i] = computers[i + 1];
            }
            // "Очищаем" последний элемент (счётчик count теперь на 1 меньше)
            computers[count - 1] = null;
            count--; // уменьшаем счётчик
            System.out.println("Компьютер удален.");
        } else {
            System.out.println("Компьютер не найден.");
        }
    }

    // Метод поиска компьютера по бренду и модели
    public Computer findComputer(String brand, String model) {
        for (int i = 0; i < count; i++) {
            // Сравниваем строковые поля с помощью метода .equals()
            if (computers[i].getBrand().equals(brand) && computers[i].getModel().equals(model)) {
                return computers[i]; // возвращаем найденный объект
            }
        }
        return null; // если не нашли, возвращаем null
    }

    // Метод для печати всех компьютеров
    public void printShop() {
        System.out.println("Товары в магазине:");
        for (int i = 0; i < count; i++) {
            System.out.println(computers[i]);
        }
    }
}