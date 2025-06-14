package Oops.Aggregation;

public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: ");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
}
