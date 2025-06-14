package JavaMiniProject;

import java.util.*;

public class ShoppingCartProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item + (quantity > 1 ? "s" : ""));
        System.out.println("Your total is $" + total);

        scanner.close();
    }
}
