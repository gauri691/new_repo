package LibraryManagement;
import java.util.Scanner;

public class Librarian extends User{
    public Librarian(String name,String address,int id)
    {
        super(name,address,id);
    }
    public void methods(Library library){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1.Add Book");
        System.out.println("2.Issue Book");
        System.out.println("3.View available Book");
        int choice =sc.nextInt();
        switch(choice){
            case 1:
            {
                System.out.print("Enter book title: ");
                String title = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter book author: ");
                String author = sc.nextLine();
                System.out.print("Enter book ID: ");
                int bookId = sc.nextInt();
                Books newBook = new Books(author,id,title);
                library.addBook(newBook);
                break;
            }
            case 3:{
                library.displayBooks();
            }
        }
        return;
    }
}
