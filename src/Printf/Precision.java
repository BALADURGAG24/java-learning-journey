package Printf;

public class Precision {
    public static void main(String[] args){

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        double price4 = 9000.99;
        double price5 = 1000000.15;
        double price6 = -54000.01;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.1f\n", price3);

        System.out.printf("\n");

        System.out.printf("%.2f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);

        System.out.printf("\n");

        System.out.printf("%.3f\n", price1);
        System.out.printf("%.3f\n", price2);
        System.out.printf("%.3f\n", price3);

        System.out.printf("\n");

        System.out.printf("%+.3f\n", price1);
        System.out.printf("%+.3f\n", price2);
        System.out.printf("%+.3f\n", price3);

        System.out.printf("\n");

        System.out.printf("%,.3f\n", price4);
        System.out.printf("%,.3f\n", price5);
        System.out.printf("%,.3f\n", price6);

        System.out.printf("\n");

        System.out.printf("%(.2f\n", price4);
        System.out.printf("%(.2f\n", price5);
        System.out.printf("%(.2f\n", price6);

        System.out.printf("\n");

        System.out.printf("% .2f\n", price4);
        System.out.printf("% .2f\n", price5);
        System.out.printf("% .2f\n", price6);
    }
}
