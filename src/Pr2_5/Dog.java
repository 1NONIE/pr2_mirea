package Pr2_5;
// Класс Dog (собака)
public class Dog {
    // Поля - кличка и возраст
    private String name;
    private int age;

    // Конструктор
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод для "перевода" возраста в человеческий
    public int getHumanAge() {
        // Умножаем на 7
        return age * 7;
    }

    // Метод toString
    @Override
    public String toString() {
        return "Dog[name=" + name + ", age=" + age + "]";
    }
}