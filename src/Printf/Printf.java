package Printf;

public class Printf {
    public static void main(String[] args){
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("you are %d years old\n", age);
        System.out.printf("you are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name , age);
    }
}
