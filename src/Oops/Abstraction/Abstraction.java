package Oops.Abstraction;

public class Abstraction {
    public static void main(String[] args){

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
