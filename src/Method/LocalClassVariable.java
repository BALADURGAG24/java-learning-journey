package Method;

public class LocalClassVariable {
    static int x = 3; //class

    public static void main(String[] args){
        int x = 1;
        System.out.println(x);
        doSomething();
    }

    static void doSomething(){
        int x = 2;
        System.out.println(x);
    }
}
