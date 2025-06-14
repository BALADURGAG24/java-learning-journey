package Operators;

import java.util.Scanner;

public class logicaloperator {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp = 35;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD 😀");
            System.out.println("It is SUNNY Outside ☀️");
        }else if(temp <= 30 && temp >= 0 && ! isSunny){
            System.out.println("The weather is GOOD 😀");
            System.out.println("It is SUNNY Outside 🌦️");
        }else if(temp > 30 || temp <0){
            System.out.println("The weather is BAD 🤕");
        }

        String username;
        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username does not contain spaces or underscores");
        } else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
