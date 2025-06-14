package Enumss;

import java.util.Scanner;

public class Enums {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
        Day day = Day.valueOf(response);
        System.out.println(day);
        System.out.println(day.getDayNumber());
        System.out.println();

        switch(day){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY,SUNDAY -> System.out.println("It is the weekend");
        }
        }catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }
        scanner.close();
    }
}
