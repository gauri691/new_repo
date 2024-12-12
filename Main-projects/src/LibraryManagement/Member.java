package LibraryManagement;
import java.util.Scanner;

import static LibraryManagement.Library.items;

public class Member extends User implements Searchable {
    public boolean search(String title) {
        for (Books book : items) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }


    public Member(String name, String address, int id) {
        super(name, address, id);
    }

    Scanner sc = new Scanner(System.in);

    public void methods(Library library) {

        System.out.println("Choose an option:");
        System.out.println("1.Issue Book");
        System.out.println("2.Return Book");
        System.out.println("3.View available Book");
        System.out.println("4.Search for a book");
        int choice = sc.nextInt();
        String title;
        do {
            switch (choice) {
                case 1: {
                    System.out.print("Enter the book ID to issue: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;
                }
                case 2: {
                    System.out.print("Enter the book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;
                }
                case 3: {
                    library.displayBooks();
                    break;
                }
                case 4: {
                    System.out.print("Enter the title of the book to search: ");
                    title = sc.nextLine();
                    sc.nextLine();
                    if (search(title)) {
                        System.out.println("Item found:" + title);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                }
            } System.out.println("Choose an option:");
            choice = sc.nextInt();
        } while (choice != 4);
        return;
    }
}

