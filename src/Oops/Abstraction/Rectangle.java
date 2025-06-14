package Oops.Abstraction;

public class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return 0;
    }
}
