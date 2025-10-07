package Pr2_1;

public class TestAuthor {

    public static void main(String[] args) {
        Author author1 = new Author("Nikita Chernov", "Nikita.p@example.com", 'm');
        System.out.println(author1);

        author1.setEmail("new.email@example.com");
        System.out.println("После изменения email: " + author1);
    }
}