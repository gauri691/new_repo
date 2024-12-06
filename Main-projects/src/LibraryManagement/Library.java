package LibraryManagement;


abstract class LibraryItem {
    public abstract void displayDetails();
}
 class Library {
     static final int maxLength = 100;
     public static Books[] items = new Books[maxLength];

     int count = 1;

     public void addBook(Books book) {
         if (count < maxLength) {
             items[count++] = book;
             System.out.println("Book added to the library.");
         } else {
             System.out.println("library is full");
         }
     }

     public void issueBook(int bookId) {
         for (Books book : items) {
             System.out.println(book);
             if (book.getId() == bookId) {
                 Books.issueBook();
                 break;
             }
         }
     }


     public void returnBook(int bookId) {
         for (Books book : items) {
             if (book.getId() == bookId) {
                 Books.returnBook();
             }
         }
     }

     public void displayBooks() {
         System.out.println("Books in the library:");
         for (Books book : items) {
             {
                 System.out.println(STR."Book id:\{book.getId()}Book Title:\{book.getTitle()}Book Author:\{book.getAuthor()}");
             }
         }
     }
 }
