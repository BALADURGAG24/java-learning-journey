package Math;

public class MathValue {
    public static void main (String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double pow;
        pow = Math.pow(2,3);
        System.out.print(pow);

        double abs;
        abs = Math.abs(-5);
        System.out.println(abs);

        double sqrt;
        sqrt = Math.sqrt(9);
        System.out.println(sqrt);

        long round;
        round = Math.round(5.49);
        System.out.println(round);

        double ceil;
        ceil = Math.ceil(7.59);
        System.out.println(ceil);

        double floor;
        floor = Math.floor(9.59);
        System.out.println(floor);

        double max;
        max = Math.max(10, 20);
        System.out.println(max);

        double min;
        min = Math.min(10, 20);
        System.out.println(min);

    }
}
