package Oops.Object;

// import java.util.Random;
import java.util.Scanner;

public class Object {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Random random = new Random();

        Car car = new Car();

//        car.isRunning = true;

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
//        System.out.println(car.isRunning);

        System.out.println();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        System.out.println();

        car.drive();
        car.brake();

        System.out.println();

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);
        scanner.close();
    }
}
