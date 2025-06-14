package ControlFlowStatements;

import java.util.Scanner;

public class BreakandContinue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<10;i++){
            if(i==5){
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i =0; i<10;i++){
            if(i==5){
                continue;
            }
            System.out.print(i + " ");
        }
scanner.close();
    }
}
