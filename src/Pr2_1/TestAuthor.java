package Pr2_1;

// Класс для проверки работы класса Author
public class TestAuthor {
    public static void main(String[] args) {
        // Создаем объект author1 с помощью конструктора
        Author author1 = new Author("Nikita Chernov", "nik.c@example.com", 'm');
        // Выводим информацию об авторе (вызовется toString)
        System.out.println(author1);

        // Меняем email через сеттер
        author1.setEmail("new.email@example.com");
        System.out.println("После изменения email: " + author1);
    }
}