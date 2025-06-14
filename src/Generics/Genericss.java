package Generics;

import java.util.ArrayList;

public class Genericss {
    public static void main(String[] args){

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        System.out.println(fruits);

        System.out.println();

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Double> box3 = new Box<>();

        box1.setItem("banana");
        System.out.println(box1.getItem());
        System.out.println();

        box2.setItem(1);
        System.out.println(box2.getItem());
        System.out.println();

        box3.setItem(3.14);
        System.out.println(box3.getItem());
        System.out.println();

        Product<String, Double> product1 =  new Product<>("apple", 0.50);
        Product<String, Integer> product2 =  new Product<>("ticket", 14);

        System.out.print(product1.getItem()+" ");
        System.out.println(product1.getPrice());
        System.out.print(product2.getItem()+" ");
        System.out.println(product2.getPrice());
    }
}
