package LibraryManagement;

public class Book {
    private String bookAuthor;
    private int bookId;
    private String bookTitle;
    private boolean bookAvailability;
    private boolean bookIssued;

    public Book(String bookAuthor,int bookId,String bookTitle){
        this.bookAuthor=bookAuthor;
        this.bookId=bookId;
        this.bookTitle=bookTitle;
        this.bookIssued=bookIssued=true;//book is issued
        this.bookAvailability=bookAvailability;
    }
    public String getTitle(){
        return bookTitle;
    }
    public int getId(){
        return bookId;
    }
    public String getAuthor(){
        return bookAuthor;
    }
    public boolean getAvailabiility(){
        return bookIssued;
    }
    public void bookissue(){
        if(getAvailabiility()){
            System.out.println("Sorry book is issued");
        }
        else{
            System.out.println("LibraryManagement.Book is available!!");
        }
    }
    public void displayDetails(String bookTitle,String bookAuthor,int bookId){
        System.out.println("LibraryManagement.Book id:"+bookId+"LibraryManagement.Book Title:"+ bookTitle+"LibraryManagement.Book Author:"+bookAuthor);
    }
}