package Method;

public class Method {
    public static void main(String[] args)
    {
        String fullName = "spongebob squarepants";
        System.out.println(fullName);
        System.out.println();

        happyBirthday("Alice", 25);
        System.out.println();

        System.out.println("Square of 3: " + square(3));
        System.out.println();

        System.out.println("Cube of 3: " + cube(3));
        System.out.println();

        int age =21;
        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }else{
            System.out.println("You must be 18+ to sign up");
        }
    }
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}