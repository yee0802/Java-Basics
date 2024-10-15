package books;

public class Book {
    String title;
    int pages;
    int currentPage = 1;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
}
