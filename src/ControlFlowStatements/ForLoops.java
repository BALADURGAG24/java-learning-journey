package ControlFlowStatements;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int j=0;j<=10;j++){
            System.out.println(j+" Pizza");
        }

        System.out.println();

        for(int j=0;j<=10;j+=2){
            System.out.println(j+" Pizza");
        }

        System.out.println();

        for(int i=10;i>=0;i-=3){
            System.out.println(i+" Pizza");
        }

        System.out.println();

        for(int i=10;i>=0;i--){
            System.out.println(i+" Pizza");
        }

        System.out.println();

        System.out.print("Enter how may times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0;i <= max; i++){
            System.out.println(i);
        }

        scanner.close();

    }
}
