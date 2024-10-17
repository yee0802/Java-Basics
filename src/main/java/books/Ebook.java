package books;

public class Ebook extends Book {
    public enum FileType {
        EPUB,
        MOBI,
        PDF
    };

    FileType fileType;

    public Ebook(String title, int pages, FileType fileType) {
        super(title, pages);
        this.fileType = fileType;
    }
}
