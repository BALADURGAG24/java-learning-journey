package Oops.Aggregation;

public class Aggregation {
    public static void main(String[] args){

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        System.out.println(book1.displayInfo());
        System.out.println(book2.displayInfo());
        System.out.println(book3.displayInfo());

        System.out.println();

        for(Book book : books){
            System.out.println(book.displayInfo());
        }

        System.out.println();

        Library library = new Library("NYC Public Library", 1897, books);
        library.displayInfo();
    }
}
