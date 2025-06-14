package ControlFlowStatements;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
        }
        scanner.close();
    }
}
