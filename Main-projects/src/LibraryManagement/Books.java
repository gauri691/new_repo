package LibraryManagement;


public class Books {
    private final String bookAuthor;
    private final int bookId;
    private final String bookTitle;
    private boolean bookAvailability;
    private static boolean bookIssued;

    public Books(String bookAuthor, int bookId, String bookTitle) {
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookIssued = bookIssued = true;//book is issued
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

    public static boolean getAvailabiility() {
        return bookIssued;
    }


    public static void issueBook(Books book) {
        if (book.getAvailabiility()) {
            System.out.println("The book has been issued.");
        } else {
            System.out.println("Sorry, the book is already issued.");
        }
    }

    public static void returnBook(Books book) {
        if (book.getAvailabiility()) {
            System.out.println("The book has  been returned.");
        } else {
            System.out.println("the book has not been returned");
        }
    }
}

