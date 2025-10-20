package Pr2_8;
// Программа, меняющая порядок элементов массива на обратный
public class ReverseArray {
    public static void main(String[] args) {
        // Исходный массив строк
        String[] array = {"hello", "world", "my", "name", "Nikita"};

        // Выводим до
        System.out.println("До:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Переменная для длины массива
        int length = array.length;
        // Проходим только до середины массива
        for (int i = 0; i < length / 2; i++) {
            // Берем элемент с начала (i) и с конца (length - 1 - i)
            String temp = array[i]; // временная переменная
            array[i] = array[length - 1 - i]; // ставим в начало элемент с конца
            array[length - 1 - i] = temp; // ставим в конец элемент с начала
        }

        // Выводим после
        System.out.println("После:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}