package DataType;

import java.util.Scanner;

public class StudentDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("what is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello " + name);

        if(age >  0){
        System.out.println("you are " + age + " years old");}
        else{
            System.out.println("your age is invalid");
        }

        System.out.println("Your gpa is "+ gpa);

        if(isStudent){
            System.out.println("you are enrolled as a student");
        }else{
            System.out.println("you are not enrolled as a student");
        }
        scanner.close();

    }
}
