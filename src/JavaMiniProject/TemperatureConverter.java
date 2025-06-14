package JavaMiniProject;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Is the input temperature in Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp * 9 / 5) + 32 : (temp - 32) * 5 / 9;
        String newUnit = (unit.equals("C")) ? "F" : "C";

        System.out.printf("Converted temperature: %.1f°%s%n", newTemp, newUnit);

        scanner.close();
    }
}
