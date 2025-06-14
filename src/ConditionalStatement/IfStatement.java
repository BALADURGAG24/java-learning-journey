package ConditionalStatement;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("enter your name: ");
        name = scanner.nextLine();

        System.out.print("enter your age: ");
        age=scanner.nextInt();

        System.out.print("Are you a Student (true/false)?: ");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("You didn't enter your name! ⚠️");
        }else{
            System.out.println("Hello " + name + "! 😀");
        }

        if(age >= 65){
            System.out.println("You are a senior! 👴👵");
        }
        else if(age >= 18) {
            System.out.println("you are an adult! 👨👩‍🦰");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet! 😇");
        }
        else if(age == 0){
            System.out.println("You are a baby! 👶");
        }
        else{
            System.out.println("you are a child! 🤕");
        }
        if(isStudent){
            System.out.println("You are a student 👨‍🎓");
        }else{
            System.out.println("you are not an student! 🏢");
        }
        scanner.close();
    }
}
