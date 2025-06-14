package Threadings.Threading;

import java.util.Scanner;

public class Threading {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        scanner.close();
    }
}
