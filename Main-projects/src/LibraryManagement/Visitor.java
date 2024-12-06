package LibraryManagement;

public class Visitor extends User {
        public Visitor(String name, String address, int id) {
            super(name, address, id);
        }
        public void  methods(Library library) {
            System.out.println("you can only view the library books ");
            library.displayBooks();
            return ;
        }
    }
