package books;

public class Book {
    String title;
    int pages;
    int currentPage = 1;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void turnPage(int numOfPages) {
        int pageToTurnTo = currentPage + numOfPages;

        if (pageToTurnTo > pages || pageToTurnTo <= 0) {
            return;
        }

        this.currentPage = pageToTurnTo;
    }

    public int showCurrentPageNumber() {
        return this.currentPage;
    }
}
