package Pr2_7;

public class BookTest {
    public static void main(String[] args) {
        Shelf shelf = new Shelf(5);

        shelf.addBook(new Book("Book A", "Author A", 1995));
        shelf.addBook(new Book("Book B", "Author B", 2005));
        shelf.addBook(new Book("Book C", "Author C", 1980));
        shelf.addBook(new Book("Book D", "Author D", 2010));

        System.out.println("Самая поздняя книга: " + shelf.getLatestBook());
        System.out.println("Самая ранняя книга: " + shelf.getEarliestBook());

        System.out.println("\nДо сортировки:");
        shelf.printShelf();

        shelf.sortBooksByYear();

        System.out.println("\nПосле сортировки по году:");
        shelf.printShelf();
    }
}