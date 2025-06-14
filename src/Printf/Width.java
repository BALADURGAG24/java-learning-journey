package Printf;

public class Width {
    public static void main(String[] args){
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%d\n",id1);
        System.out.printf("%d\n",id2);
        System.out.printf("%d\n",id3);
        System.out.printf("%d\n",id4);

        System.out.printf("\n");

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("\n");

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.printf("\n");

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);

    }
}
