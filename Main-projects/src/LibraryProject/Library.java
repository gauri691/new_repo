package LibraryProject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import LibraryProject.Books;
class Library {
    private static Library libraryInstance = null;
    private static final int maxLength = 100;
    private Map<Books, Integer> items;
    private int count = 0;


        private Library() {
            items=new HashMap<>();
            Books book1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", true,101);
            Books book2 = new Books("To Kill a Mockingbird", "Harper Lee", true,102);

            items.put(book1, 2);
            items.put(book2, 3);
        }
    public static Library getInstance() {
            if (libraryInstance == null) {
                libraryInstance = new Library();
            }
            return libraryInstance;
        }

        public Map<Books, Integer> getItems() {
            return items;
        }


        public List<String> getBooks() {
            return (List<String>) items;
        }

        public void addBook(Books book) {
            if (count < maxLength) {
                items.put(book, book.getId());
                System.out.println("Book added to the library.");
            } else {
                System.out.println("library is full");
            }
        }
        public void displayBooks() {
            if (items.isEmpty()) {
                System.out.println("No books available.");
            } else {
                for (Map.Entry<Books, Integer> entry : items.entrySet()) {
                    Books book = entry.getKey();
                    int copies = entry.getValue();
                    System.out.println("Book ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Copies: " + copies);
                }
            }
        }
}