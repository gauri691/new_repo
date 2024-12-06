package LibraryManagement;

public class Books {
    private final String bookAuthor;
    private final int bookId;
    private final String bookTitle;
    private boolean bookAvailability;
    private boolean bookIssued;

    public Books(String bookAuthor, int bookId, String bookTitle) {
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookIssued = bookIssued=true;//book is issued
        this.bookAvailability = bookAvailability;
    }

    public String getTitle() {
        return bookTitle;
    }

    public int getId() {
        return bookId;
    }

    public String getAuthor() {
        return bookAuthor;
    }

    public boolean getAvailabiility() {
        return bookIssued;
    }

    public void bookissue() {
        if (getAvailabiility()) {
            System.out.println("Sorry book is already issued");
        } else {
            System.out.println("Book is available!!");
        }
    }
}