package Oops.ToString;

public class ToString {
    public static void main(String[] args){

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println(car1.color + " " + car1.year + " " + car1.make + " " + car1.model);
        System.out.println(car2.color + " " + car2.year + " " + car2.make + " " + car2.model);
    }
}
