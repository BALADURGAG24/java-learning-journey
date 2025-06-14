package ControlFlowStatements;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Do-while loop for age validation
        int age;
        do {
            System.out.println("Your age can't be negative ");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while(age < 0);
        System.out.println("You are " + age + " years old");

        // Do-while loop for number input between 1–10
        int number;
        do {
            System.out.print("Enter your number between 1 - 10: ");
            number = scanner.nextInt();
        } while(number < 1 || number > 10);
        System.out.println("You picked " + number);

        scanner.close();
    }
}
