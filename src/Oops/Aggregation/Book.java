package Oops.Aggregation;

public class Book {

    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    String displayInfo(){
        return this.title + " (" + this.pages + " pages)";
    }
}
