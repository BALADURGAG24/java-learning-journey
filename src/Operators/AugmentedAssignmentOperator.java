package Operators;

public class AugmentedAssignmentOperator {
    public static void main(String[] args) {

        double x = 10;
        double y = 3.5;

        x = x + y;
        System.out.println(x);
        x += y;
        System.out.println(x);

        x = x - y;
        System.out.println(x);
        x -= y;
        System.out.println(x);

        x = x * y;
        System.out.println(x);
        x *= y;
        System.out.println(x);

        x = x / y;
        System.out.println(x);
        x /= y;
        System.out.println(x);

        x = x % y;
        System.out.println(x);
        x %= y;
        System.out.println(x);
    }
}
