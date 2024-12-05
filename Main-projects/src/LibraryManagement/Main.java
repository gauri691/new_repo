package LibraryManagement;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User member = new Member("Gauri", "123 Main St", 1);
        User visitor = new visitor("Abhimanyu", "456 Oak St", 2);
        User librarian = new Librarian("Navin", "789 Pine St", 3);

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 101));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 102));

        member.methods(library);
        librarian.methods(library);
        visitor.methods(library);
    }
}



    }
}
