package Oops.Composition;

public class Composition {
    public static void main(String[] args){

        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        System.out.println();

        car.start();
    }
}
