package Oops.ArraysofObjects;

public class ArraysofObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        System.out.println();

        for (Car car : cars) {
            car.drive();
        }

        System.out.println();

        Car[] newCars = {
                new Car("Mustang", "Red"),
                new Car("Corvette", "Blue"),
                new Car("Charger", "Yellow")
        };

        for (Car car : newCars) {
            car.drive();
        }

        System.out.println();

        for (Car car : newCars) {
            car.color = "black";
        }
        for (Car car : newCars) {
            car.drive();
        }
    }
}
