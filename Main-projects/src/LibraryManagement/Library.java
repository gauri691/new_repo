package LibraryManagement;


abstract class LibraryItem {
    public abstract void displayDetails();
}
 class Library {
     static final int maxLength = 100;
     public static Books[] items = new Books[maxLength];

     int count = 3;

     public void addBook(Books book) {
         if (count < maxLength) {
             items[count++] = book;
             System.out.println("Book added to the library.");
         } else {
             System.out.println("library is full");
         }
     }

     public void issueBook(int bookId) {
         for (int i = 0; i <count ; i++) {
             Books book = items[i];
             if (book.getId() == bookId) {
                 System.out.println("The book has been issued");
                 return;
             }
         }
         System.out.println(STR."Book with ID \{bookId} not found.");
     }

     public void returnBook(int bookId) {
         for (int i = 0; i < count; i++) {
             if (items[i].getId() == bookId) {
                 System.out.println("The book has been returned");
             }
             return;
         }
         System.out.println(STR."Book with ID \{bookId} not found.");
     }

     public void displayBooks() {
         System.out.println("Books in the library:");
         for (int i = 0; i < count; i++) {
             System.out.println(STR."Book id:\{items[i].getId()}Book Title:\{items[i].getTitle()}Book Author:\{items[i].getAuthor()}");
         }
     }
 }