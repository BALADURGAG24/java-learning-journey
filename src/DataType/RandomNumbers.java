package DataType;

import java.util.Random;

public class RandomNumbers {
    public static void main (String[] args){

        Random random1 = new Random();
        int number1;
        int number2;
        int number3;
        number1 = random1.nextInt(1,100);
        number2 = random1.nextInt(1,100);
        number3 = random1.nextInt(1,100);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.print("\n");

        Random random2 = new Random();
        Double number11;
        Double number22;
        Double number33;
        number11 = random2.nextDouble(1,100);
        number22 = random2.nextDouble(1,100);
        number33 = random2.nextDouble(1,100);
        System.out.println(number11);
        System.out.println(number22);
        System.out.println(number33);

        System.out.print("\n");

        Random random3 = new Random();
        boolean isHeads;
        isHeads = random3.nextBoolean();
//        System.out.println(isHeads);

        if(isHeads){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }

    }
}
