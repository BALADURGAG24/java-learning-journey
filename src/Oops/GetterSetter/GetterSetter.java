package Oops.GetterSetter;

public class GetterSetter {
    public static void main(String[] args){

        Car car = new Car("Charger", "Yellow", 10000);

//        car.model = "Corvette";

//        car.setModel("Corvette");
        car.setColor("Blue");
        car.setPrice(-5000);

        System.out.println(car.getColor()+ " " + car.getModel() + " " + car.getPrice());
    }
}
