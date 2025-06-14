package Oops.Inheritance;

public class Inheritance {
    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        System.out.println();

        dog.eat();
        cat.eat();

        System.out.println();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        System.out.println();

        dog.speak();
        cat.speak();

        System.out.println();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        System.out.println();

        Plant plant = new Plant();

        System.out.println(plant.isAlive);

        System.out.println();

        plant.photosynthesis();
    }
}
