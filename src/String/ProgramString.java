package String;

public class ProgramString {
    public static void main(java.lang.String[] args){

        java.lang.String name1 = "Bro Code";
        java.lang.String name2 = "Hari Haran";
        java.lang.String name3 = "   Bro Code   ";
        java.lang.String name4 = "light house";
        java.lang.String name5 = "Password";

        int length = name1.length();
        char letter = name1.charAt(1);
        int index = name1.indexOf(" ");
        int lastIndex = name1.lastIndexOf("o");

        name1 = name1.toUpperCase();
        name2 = name2.toLowerCase();
        name3 = name3.trim();
        name4 = name4.replace("a", "o");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name4.isEmpty());

        if(name4.isEmpty()) {
            System.out.println("you name is empty");
        }else{
            System.out.println("Hello "+name4);
        }

        if(name4.contains(" ")){
            System.out.println("you name contain space");
        }else{
            System.out.println("your name doesn't contain any spaces");
        }

        if(name5.equals("password")){
            System.out.println("Your name can't be password");
        }else{
            System.out.println("Hello "+name5);
        }

        if(name5.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }else{
            System.out.println("Hello "+name5);
        }
    }
}
