package String;

import java.util.*;

public class SubString {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter an email id: ");
        email=scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            char at = '@';
            String hari = username + at  + domain;

            System.out.println(email);
            System.out.println(username);
            System.out.println(domain);
            System.out.println(hari);
        }else{
            System.out.println("Emails must contain @");
        }
        scanner.close();
    }
}
