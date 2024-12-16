package LibraryProject;

    public class Books {
        private final int bookId;
        private final String bookTitle;
        private final String bookAuthor;
        private boolean bookAvailability;

        public Books(String bookTitle, String bookAuthor, boolean bookAvailability,int bookId) {
            this.bookId = bookId;
            this.bookTitle = bookTitle;
            this.bookAuthor = bookAuthor;
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

        public boolean isBookAvailability() {
            return bookAvailability;
        }

        public void setBookAvailability(boolean bookAvailability) {
            this.bookAvailability = bookAvailability;
        }
    }


