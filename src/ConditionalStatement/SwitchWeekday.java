package ConditionalStatement;

import java.util.Scanner;

public class SwitchWeekday {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day:");
        String day = scanner.nextLine();
        switch(day){
            case "Monday" -> System.out.println("This is a weekday");
            case "Tuesday" -> System.out.println("This is a weekday");
            case "Wednesday" -> System.out.println("This is a weekday");
            case "Thursday" -> System.out.println("This is a weekday");
            case "Friday" -> System.out.println("This is a weekday");
            case "Saturday" -> System.out.println("This is a weekend");
            case "Sunday" -> System.out.println("This is a weekend");
            default -> System.out.println("This is not a valid day");
        }
        scanner.close();
    }
}
