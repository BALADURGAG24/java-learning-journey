package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Double>  list2 = new ArrayList<>();
        ArrayList<String>  list3 = new ArrayList<>();
        ArrayList<String>  list4 = new ArrayList<>();
        ArrayList<String>  list5 = new ArrayList<>();
        ArrayList<String>  foods = new ArrayList<>();

        list1.add(3);
        list1.add(1);
        list1.add(2);
        System.out.println(list1);
        System.out.println();

        list2.add(3.14);
        list2.add(1.06);
        list2.add(2.99);
        System.out.println(list2);
        System.out.println();

        list3.add("Apple");
        list3.add("Banana");
        list3.add("Cherry");
        list3.add("Dates");
        System.out.println(list3);
        System.out.println();

        list4.add("Apple");
        list4.add("Banana");
        list4.add("Cherry");
        list4.add("Dates");
        list4.remove(0);
        System.out.println(list4);
        System.out.println();

        list5.add("Apple");
        list5.add("Orange");
        list5.add("Banana");
        list5.add("Papaya");
        list5.add("Cherry");
        list5.add("Watermelon");
        list5.add("Dates");
        list5.set(6, "Apricot");
        System.out.println(list5);
        System.out.println();

        System.out.println(list5.get(0));
        System.out.println();

        System.out.println(list5.size());
        System.out.println();

        Collections.sort(list5);
        System.out.println(list5);
        System.out.println();

        for(String fruit : list5)
            System.out.println(fruit);
        System.out.println();


        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

            scanner.close();
    }
}
