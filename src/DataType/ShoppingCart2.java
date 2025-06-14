package DataType;

import java.util.*;

public class ShoppingCart2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("what would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("what is the price of each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you want?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " +item+ "/s");
        System.out.println("Your total is " + currency + "" + total);
        scanner.close();
    }
}
