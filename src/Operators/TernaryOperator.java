package Operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score=scanner.nextInt();
        String scores = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(scores);

        System.out.println();

        System.out.print("Enter the number: ");
        int evenodd=scanner.nextInt();
        String evenorodd = (evenodd % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenorodd);

        System.out.println();

        System.out.print("Enter the hour: ");
        int hour=scanner.nextInt();
        String timeofday = (hour < 12) ? "AM" : "PM";
        System.out.println(timeofday);

        System.out.println();

        System.out.print("Enter the income: ");
        int income=scanner.nextInt();
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
        scanner.close();
    }
}
