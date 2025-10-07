package Pr2_5;

public class DogKennel {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Buddy", 3);
        dogs[1] = new Dog("Max", 5);
        dogs[2] = new Dog("Luna", 2);

        System.out.println("Собаки в питомнике:");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
            System.out.println("Возраст в 'человеческих' годах: " + dogs[i].getHumanAge());
        }
    }
}