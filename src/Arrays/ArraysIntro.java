package Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args){
        String[] fruits = {"apple", "orange", "banana", "coconut"};
//        fruits[0]= "pineapple";
        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println();

        System.out.println(numOfFruits);
        System.out.println();

        for(int i=0;i<fruits.length;i++){
            System.out.print(fruits[i] + " ");
        }
        System.out.println("\n");

        for (String s : fruits) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        Arrays.sort(fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println();

        Arrays.fill(fruits, "strawberry");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
