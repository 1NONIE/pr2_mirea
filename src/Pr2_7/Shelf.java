package Pr2_7;
// Класс Shelf (книжная полка) - композиция с Book
public class Shelf {
    // Поля - массив книг и счётчик
    private Book[] books;
    private int count;

    // Конструктор полки
    public Shelf(int maxSize) {
        this.books = new Book[maxSize];
        this.count = 0;
    }

    // Метод добавления книги
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        }
    }

    // Метод поиска самой поздней книги
    public Book getLatestBook() {
        if (count == 0) return null; // если полка пуста
        Book latest = books[0]; // берем первую книгу как кандидата
        // Проходим по остальным книгам
        for (int i = 1; i < count; i++) {
            // Если текущая книга новее (год больше), чем кандидат
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i]; // обновляем кандидата
            }
        }
        return latest; // возвращаем найденную книгу
    }

    // Метод поиска самой ранней книги (аналогично)
    public Book getEarliestBook() {
        if (count == 0) return null;
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return earliest;
    }

    // Метод сортировки книг по году (пузырьковая сортировка)
    public void sortBooksByYear() {
        // Внешний цикл - количество проходов
        for (int i = 0; i < count - 1; i++) {
            // Внутренний цикл - сравнение и обмен
            for (int j = 0; j < count - 1 - i; j++) {
                // Если текущий год больше следующего
                if (books[j].getYear() > books[j + 1].getYear()) {
                    // Меняем местами объекты в массиве
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Метод печати
    public void printShelf() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}