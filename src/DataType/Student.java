package DataType;

public class Student {
    public static void main(String[] args){
        // this is my first java program
        /*
        hello
        */
//        System.out.println("hello");
//        System.out.println("hello24");
//        System.out.println("Buy me pizza!");
//        System.out.println();

        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "hello";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "mustang";
        String color = "red";

        System.out.println("you choice is a "+ color + " " + year + " " + car);
        System.out.println("the price is: " +currency + price);
        if(forSale){
            System.out.println("there is a " + car + " for sale");
        }else{
            System.out.println("the " + car + " is not for sale");
        }
        String names = "bro code";
        int gta = 6;
        double pi =3.14159;
        char gender = 'm';
        boolean isAdmin = true;

        System.out.println("i studied in the youtube channel named "+ names);
        System.out.println("the current gta is to be released the version of " +gta);
        System.out.println("the value of pi is " + pi);
        System.out.println("my gender is " + gender);
        if(isAdmin){
            System.out.println("good");
        }else{
            System.out.println("bad");
        }
    }
}
