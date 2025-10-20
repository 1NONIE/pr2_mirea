package Pr2_4;

// Класс Computer (компьютер) - товар для магазина
public class Computer {
    private String brand; // бренд
    private String model; // модель
    private double price; // цена

    // Конструктор
    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Геттеры - нужны, чтобы потом искать компьютеры по этим параметрам
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    // Метод toString
    @Override
    public String toString() {
        return "Computer[brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }
}