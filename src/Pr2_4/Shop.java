package Pr2_4;

public class Shop {

    private Computer[] computers;
    private int count;

    public Shop(int maxSize) {
        this.computers = new Computer[maxSize];
        this.count = 0;
    }

    public void addComputer(Computer comp) {
        if (count < computers.length) {
            computers[count] = comp;
            count++;
            System.out.println("Компьютер добавлен.");
        } else {
            System.out.println("Магазин полон, невозможно добавить компьютер.");
        }
    }

    public void removeComputer(Computer comp) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (computers[i] == comp) { // Сравнение по ссылке
                index = i;
                break;
            }
        }
        if (index != -1) {
            // Сдвигаем элементы
            for (int i = index; i < count - 1; i++) {
                computers[i] = computers[i + 1];
            }
            computers[count - 1] = null; // Очищаем последний элемент
            count--;
            System.out.println("Компьютер удален.");
        } else {
            System.out.println("Компьютер не найден.");
        }
    }

    public Computer findComputer(String brand, String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getBrand().equals(brand) && computers[i].getModel().equals(model)) {
                return computers[i];
            }
        }
        return null; // Не найден
    }

    public void printShop() {
        System.out.println("Товары в магазине:");
        for (int i = 0; i < count; i++) {
            System.out.println(computers[i]);
        }
    }
}