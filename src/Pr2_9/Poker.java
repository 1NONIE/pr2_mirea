package Pr2_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Вспомогательный класс для карты
class Card {
    private String suit; // масть
    private String rank; // достоинство

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        // Например, "Туз пик"
        return rank + " " + suit;
    }
}

// Вспомогательный класс для колоды
class Deck {
    private List<Card> cards; // список карт

    public Deck() {
        cards = new ArrayList<>(); // создаем пустой список
        // Русские названия мастей
        String[] suits = {"Черви", "Бубны", "Крести", "Пики"};
        // Русские названия достоинств (от 2 до Туза)
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        // Заполняем колоду 52 (писятдва) картами
        for (String suit : suits) { // для каждой масти
            for (String rank : ranks) { // для каждого достоинства
                cards.add(new Card(suit, rank)); // создаем карту и добавляем в список
            }
        }
    }

    // Метод тасования колоды
    public void shuffle() {
        Collections.shuffle(cards); // используем встроенный метод
    }

    // Метод выдачи одной карты
    public Card dealCard() {
        if (!cards.isEmpty()) { // если в колоде еще есть карты
            return cards.remove(cards.size() - 1); // берем последнюю и удаляем
        }
        return null; // если колода пуста, возвращаем null
    }
}

// Основной класс игры
public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков (n): ");
        int n = scanner.nextInt();
        // Проверяем, что игроков не слишком много (52 / 5 = 10.4, т.е. максимум 10 игроков)
        if (n <= 0 || n * 5 > 52) {
            System.out.println("Неверное количество игроков или недостаточно карт.");
            scanner.close();
            return; // выходим из программы
        }

        // Создаем колоду и тасуем
        Deck deck = new Deck();
        deck.shuffle();

        // Раздаем карты каждому игроку
        for (int player = 1; player <= n; player++) {
            System.out.println("Игрок " + player + ":");
            for (int cardNum = 0; cardNum < 5; cardNum++) { // по 5 карт
                Card card = deck.dealCard(); // выдаем карту
                if (card != null) { // если карта есть
                    System.out.println("  " + card); // выводим
                }
            }
            System.out.println(); // пустая строка между игроками
        }

        scanner.close();
    }
}