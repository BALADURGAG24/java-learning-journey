package Threadings.MultiThreading;

public class MultiThreading {
    public static void main(String[] args){

//        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
//            throw new RuntimeException(e);
            System.out.println("Main thread was interrupted");
        }
        System.out.println("GAME OVER!");
    }
}
