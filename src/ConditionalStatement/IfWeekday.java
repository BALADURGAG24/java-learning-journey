package ConditionalStatement;

import java.util.Scanner;

public class IfWeekday {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = scanner.nextLine();

        if(day.equalsIgnoreCase("Monday")){
            System.out.println("This is a weekday");
        }
        else if(day.equalsIgnoreCase("Tuesday")){
            System.out.println("This is a weekday");
        }
        else if(day.equalsIgnoreCase("Wednesday")){
            System.out.println("This is a weekday");
        }
        else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("This is a weekday");
        }
        else if(day.equalsIgnoreCase("Friday")){
            System.out.println("This is a weekday");
        }
        else if(day.equalsIgnoreCase("Saturday")){
            System.out.println("This is a weekend");
        }
        else if(day.equalsIgnoreCase("Sunday")){
            System.out.println("This is a weekend");
        }
        else{
            System.out.println("This is not a day");
        }
       scanner.close();
    }
}
