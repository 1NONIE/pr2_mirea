package Pr2_7;
public class Shelf {
    private Book[] books;
    private int count;

    public Shelf(int maxSize) {
        this.books = new Book[maxSize];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        }
    }

    public Book getLatestBook() {
        if (count == 0) return null;
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest;
    }

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

    public void sortBooksByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public void printShelf() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}