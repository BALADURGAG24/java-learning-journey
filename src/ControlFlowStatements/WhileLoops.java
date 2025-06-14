package ControlFlowStatements;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // While loop for name input
        String name = "";
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        // While loop for quitting a game
        String response = "";
        while(!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game");

        // While loop for age validation
        int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        while(age < 0){
            System.out.println("Your age can't be negative ");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old");

        // While loop for number input between 1–10
        int number = 0;
        while(number < 1 || number > 10){
            System.out.print("Enter your number between 1 - 10: ");
            number = scanner.nextInt();
        }
        System.out.println("You picked " + number);

        scanner.close();
    }
}
