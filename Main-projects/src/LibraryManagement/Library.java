import LibraryManagement.*;


abstract class LibraryItem {
    public abstract void displayDetails();
}
 class Library {
    public static final int  maxLength=100;
   public static Libraryitems[] items =new Libraryitems[maxLength];
     int count=0;

   public void addBook(Book book){
       if(count<maxLength){
           items[count++]=book;
           System.out.println("LibraryManagement.Book '" + book.getTitle() + "' added to the library.");
       }
       else{
           System.out.println("library is full");
       }
   }
    public void  issueBook(int bookId) {
        for (int i = 0; i < count; i++) {
            Book book = book[i];
            if (book.getId() == bookId) {
                book.issueBook();
                return;
            }
        }
        System.out.println("LibraryManagement.Book with ID " + bookId + " not found.");
    }
    public void returnBook(int bookId) {
        for (int i = 0; i < count; i++) {
            Book book = book[i];
            if (book.getId() == bookId) {
                book.returnBook();
                return;
            }
        }
        System.out.println("LibraryManagement.Book with ID " + bookId + " not found.");
    }

    public void displayBook(){
    System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            LibraryItem[] book = new LibraryItem[0];
            book[i].displayDetails();
        }
    }
}

public boolean search(String title){
    int count=0;
    for (int i = 0; i < count; i++) {
        if (book[i].getTitle().equalsIgnoreCase(title)) {
            return true;
        }
    }
    return false;
}
