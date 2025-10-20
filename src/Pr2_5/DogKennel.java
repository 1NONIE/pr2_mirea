package Pr2_5;
// Класс питомник (для тестирования Dog)
public class DogKennel {
    public static void main(String[] args) {
        // Создаем массив объектов Dog
        Dog[] dogs = new Dog[3];
        // Создаем объекты собак и кладем в массив
        dogs[0] = new Dog("Buddy", 3);
        dogs[1] = new Dog("Max", 5);
        dogs[2] = new Dog("Luna", 2);

        System.out.println("Собаки в питомнике:");
        // Проходим по массиву и выводим информацию
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
            // Вызываем метод getHumanAge() для каждой собаки
            System.out.println("Возраст в 'человеческих' годах: " + dogs[i].getHumanAge());
        }
    }
}