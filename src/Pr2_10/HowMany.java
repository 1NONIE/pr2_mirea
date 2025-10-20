package Pr2_10;
import java.util.Scanner;

// Программа, считающая количество слов в строке
public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine(); // считываем всю строку

        // Разбиваем строку на "кусочки" по пробелам
        // split("\\s+") означает: разделяй по одному или нескольким пробельным символам
        String[] words = input.split("\\s+");

        // Считаем количество "не пустых" кусочков
        int count = 0;
        for (String word : words) { // для каждого "кусочка" в массиве
            if (!word.isEmpty()) { // если кусочек не пустой
                count++; // увеличиваем счётчик
            }
        }

        System.out.println("Количество слов: " + count);
        scanner.close();
    }
}