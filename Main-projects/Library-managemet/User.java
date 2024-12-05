 import java.util.*;
 public  class User {
    String name;
    String address;
    int id;
    public User(String name,String address,int id){
        this.name=name;
        this.address=address;
        this.id=id;
     }
     public void methods(){
        System.out.println("WELCOME\n Choose 1 for Viewing books and Magazines:");
        Book book;
        Library.displayBook();
     }
 }

class Member extends User implements searchable{
    public Member(String name,String address,int id){
        super(name,address,id);
        Scanner sc=new Scanner(System.in);
        public void methods(){
            System.out.println("Choose an option:");
            System.out.println("1.Issue Book");
            System.out.println("2.Return Book");
            System.out.println("3.View available Book");
            System.out.println("4.Search for a book;");
            int choice =sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.print("Enter the book ID to issue: ");
                    int issueId = sc.nextInt();
                    Library.issueBook(issueId);
                    break;
                }
                case 2:{
                    System.out.print("Enter the book ID to return: ");
                    int returnId = sc.nextInt();
                    Library.returnBook(returnId);
                    break;
                }
                case 3:{
                    Library.displayBook();
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
    }
}
class visitor extends User{
     public visitor(String name,String address,int id){
         super(name,address,id);
     }
     public void methods(){
         System.out.println("you can only view the library books ");
         Library.displayBook();
     }
}

class Librarian extends User{
    public Librarian(String name,String address,int id){
        super(name,address,id);
    }
    public void methods(){

    }
}
