package LibraryManagement;

import java.util.*;

interface searchable {
    boolean search(String bookTitle);
}
 public  class User {
    String name;
    String address;
    int id;
    public User(String name,String address,int id){
        this.name=name;
        this.address=address;
        this.id=id;
     }
     public <Library> void methods(Library library){
        System.out.println("WELCOME\n Choose 1 for Viewing books and Magazines:");
        Book book;
        library.displayBook();
     }
 }

class Member extends User implements searchable{
    public Member(String name,String address,int id) {
        super(name, address, id);
    }
        Scanner sc=new Scanner(System.in);
        public void methods(){
            System.out.println("Choose an option:");
            System.out.println("1.Issue LibraryManagement.Book");
            System.out.println("2.Return LibraryManagement.Book");
            System.out.println("3.View available LibraryManagement.Book");
            System.out.println("4.Search for a book;");
            int choice =sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.print("Enter the book ID to issue: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;
                }
                case 2:{
                    System.out.print("Enter the book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;
                }
                case 3:{
                    library.displayBook();
                    break;
                }
                case 4:{
                    System.out.print("Enter the title of the book or magazine to search: ");
                    String title = sc.nextLine();
                    if (search(title)) {
                        System.out.println("Item found: " + title);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                }
             }
         }

    @Override
    public boolean search(String bookTitle) {
        return false;
    }
}
}
class visitor extends User{
     public visitor(String name,String address,int id){
         super(name,address,id);
     }
     public void methods(){
         System.out.println("you can only view the library books ");
         library.displayBook();
     }
}

class Librarian extends User{
    public Librarian(String name,String address,int id){
        super(name,address,id);
    }
    public void methods(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1.Add LibraryManagement.Book");
        System.out.println("2.Issue LibraryManagement.Book");
        System.out.println("3.View available LibraryManagement.Book");
        int choice =sc.nextInt();
        switch(choice){
            case 1:
                Object library = null;
            {
                System.out.print("Enter book title: ");
                String title = sc.nextLine();
                System.out.print("Enter book author: ");
                String author = sc.nextLine();
                System.out.print("Enter book ID: ");
                int bookId = sc.nextInt();
                Book newBook = new Book(title, author, bookId);
                library.addBook(newBook);
                break;
            }
            case 2:{
                System.out.println("enter the book id:");
                int id=sc.nextInt();
                library.issueBook(id);
            }
            case 3:{
                library.displayBook();
            }
        }
    }
}
