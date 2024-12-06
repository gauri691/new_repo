package LibraryManagement;


abstract class LibraryItem {
    public abstract void displayDetails();
}
 class Library {
     static final int maxLength = 100;
     public static Books[] items = new Books[maxLength];

     int count = 0;

     public void addBook(Books book) {
         if (count < maxLength) {
             items[count] = book;
             System.out.println("Book added to the library.");
         } else {
             System.out.println("library is full");
         }
         count++;
     }

     public void issueBook(int bookId) {
         for (Books book : items) {
             if (book.getId() == bookId) {
                 Books.issueBook(book);
                 break;
             }
         }
     }


     public void returnBook(int bookId) {
         for (Books book : items) {
             if (book.getId() == bookId) {
                 Books.returnBook(book);
                 break;
             }
         }
     }

     public void displayBooks() {
         System.out.println("Books in the library:");
         for (Books book : items) {
             if (book == null) {
                 break;
             }
             System.out.println("Book id: " + book.getId() + " Book Title: " + book.getTitle() + " Book Author: " + book.getAuthor());
         }

     }
 }





