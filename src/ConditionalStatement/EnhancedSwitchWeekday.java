package ConditionalStatement;

import java.util.Scanner;

public class EnhancedSwitchWeekday {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();
        switch(day){
             case "Monday" , "Tuesday" , "Wednesday" , "Thursday" ,"Friday" -> System.out.println("This is a weekday");
             case "Saturday" , "Sunday" -> System.out.println("This is a weekend");
            default -> System.out.println("This is not a valid day");
        }
        scanner.close();
    }
}
