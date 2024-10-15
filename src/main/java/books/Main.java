package books;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Harry Potter", 30);
        System.out.println(myBook.showCurrentPageNumber());
        myBook.turnPage(29);
        System.out.println(myBook.showCurrentPageNumber());
    }
}
