package LibraryManagement;

public  class User {
     String name;
     String address;
     int id;

     public User(String name, String address, int id) {
         this.name = name;
         this.address = address;
         this.id = id;
     }
     public void methods(Library library) {
         System.out.println("Welcome " + name + "!");
         System.out.println("Choose an action:");
         System.out.println("1. View Available Books");
         library.displayBooks();
         return ;
     }
 }
