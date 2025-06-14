package Oops.RuntimePolymorphism;

import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        scanner.close();
    }
}
