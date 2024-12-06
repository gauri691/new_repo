package LibraryManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        library.addBook(new Books("F. Scott Fitzgerald", 101, "The Great Gatsby"));
        library.addBook(new Books("Harper Lee", 102, "To Kill a Mockingbird"));
        System.out.println("Choose an option:");
        System.out.println("1.Member");
        System.out.println("2.Visitor");
        System.out.println("3.Librarian");
        int choice = sc.nextInt();
        do {
            switch (choice) {
                case 1: {
                    System.out.println("Enter your name:");
                    String memberName = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter your address:");
                    String memberAdd = sc.nextLine();
                    System.out.println("Enter your member ID:");
                    int memberId = sc.nextInt();
                    User member = new Member(memberName, memberAdd, memberId);
                    member.methods(library);
                }

                case 3: {
                    User librarian = new Librarian("Charlie", "789 Pine St", 3);
                    librarian.methods(library);
                }
                case 2: {
                    System.out.println("Enter your name:");
                    String visitorName = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter your address:");
                    String visitorAdd = sc.nextLine();
                    System.out.println("Enter your member ID:");
                    int visitorId = sc.nextInt();
                    User visitor = new Visitor(visitorName, visitorAdd, visitorId);
                    visitor.methods(library);
                }
            }
        } while (choice != 3);
    }
}

