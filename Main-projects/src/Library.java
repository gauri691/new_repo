import java.util.*;
interface searchable {
    boolean search(String bookTitle);
}
public class Library {
    int maxLength=100;
   public static Libraryitems items[]=new Librayitems[maxLength];
   int count=0;

   public void addItem(Book book){
       if(count<maxLength){
           items[count++]=book;
           System.out.println("Book '" + book.getTitle() + "' added to the library.");
       }
       else{
           System.out.println("library is full");
       }
   }
    public void  issueBook(int bookId) {
        for (int i = 0; i < count; i++) {
            Book book = books[i];
            if (book.getId() == bookId) {
                book.issueBook();
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
    public void returnBook(int bookId) {
        for (int i = 0; i < count; i++) {
            Book book = book[i];
            if (book.getId() == bookId) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void displayBook(){
    System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            book[i].displayDetails();
        }
    }
}

public boolean search(String title){
    for (int i = 0; i < count; i++) {
        if (book[i].getTitle().equalsIgnoreCase(title)) {
            return true;
        }
    }
    return false;
}
