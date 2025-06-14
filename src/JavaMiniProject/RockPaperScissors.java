package JavaMiniProject;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "Yes";

        do{
        System.out.print("Enter your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

                if(!playerChoice.equals("rock") &&
                   !playerChoice.equals("paper") &&
                   !playerChoice.equals("scissors")){
                   System.out.println("Invalid choice");
                   continue;
        }
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: "+ computerChoice);

        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a tie!");}

        else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You Win!");}

        else{
            System.out.println("You Lose!");
        }

        System.out.print("Play again (Yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.print("Thanks for playing");
        scanner.close();
    }
}
