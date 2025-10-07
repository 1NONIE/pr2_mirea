package Pr2_9;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

// Вспомогательный класс для карты
class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Вспомогательный класс для колоды
class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        }
        return null; // Колоды не осталось
    }
}

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков (n): ");
        int n = scanner.nextInt();
        if (n <= 0 || n * 5 > 52) {
            System.out.println("Неверное количество игроков или недостаточно карт.");
            scanner.close();
            return;
        }

        Deck deck = new Deck();
        deck.shuffle();

        for (int player = 1; player <= n; player++) {
            System.out.println("Игрок " + player + ":");
            for (int cardNum = 0; cardNum < 5; cardNum++) {
                Card card = deck.dealCard();
                if (card != null) {
                    System.out.println("  " + card);
                }
            }
            System.out.println(); // Пустая строка между игроками
        }

        scanner.close();
    }
}