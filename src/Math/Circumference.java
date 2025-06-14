package Math;

import java.util.Scanner;

public class Circumference {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double radius;
        double  circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is: " + circumference + "cm");
        System.out.println("The area is: " + area + "cm²");
        System.out.println("The volume is: " + volume + "cm³");

        System.out.println("");

        System.out.printf("The circumference is: %.1fcm\n" , circumference);
        System.out.printf("The area is: %.1fcm²\n" , area);
        System.out.printf("The volume is: %.1fcm³\n " , volume);
                scanner.close();
    }
}
