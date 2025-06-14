package Oops.WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args){

        // old method
//        Integer a = new Integer(123);
//        Double b = new Double(3.14);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);

        // Autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;
//        String e = "Pizza";

        // Unboxing
//        int x = a;
//        double y = b;
//        char z = c;
//        boolean w = d;
//        String j = e;

//        String a = Integer.toString(123);
//        String b = Double.toString(3.15);
//        String c = Character.toString('@');
//        String d = Boolean.toString(false);
//
//        String x = a + b + c + d;
//
//        System.out.println(x);

//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");
//
//        String x = a + b + c + d;
//
//        System.out.println(x);

        char letter1 = 'a';
        System.out.println(Character.isLetter(letter1));
        System.out.println();

        char letter2 = 'b';
        System.out.println(Character.isLetter(letter2));
        System.out.println(Character.isUpperCase(letter2));
        System.out.println();

        char letter3 = 'B';
        System.out.println(Character.isLetter(letter3));
        System.out.println(Character.isUpperCase(letter3));
        System.out.println();

        char letter4 = '$';
        System.out.println(Character.isLetter(letter4));

    }
}
