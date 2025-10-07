package Pr2_10;
        import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        // Разбиваем строку по пробелам
        String[] words = input.split("\\s+"); // \\s+ означает один или несколько пробельных символов

        // Убираем пустые строки, которые могут появиться в начале/конце
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println("Количество слов: " + count);
        scanner.close();
    }
}