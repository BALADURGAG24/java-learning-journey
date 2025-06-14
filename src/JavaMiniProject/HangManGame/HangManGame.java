package JavaMiniProject.HangManGame;

import java.util.ArrayList;
import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args){

       String word  = "pizza";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java HangMan!");
        System.out.println("************************");

        while(wrongGuesses < 6){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");

            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess!");

                for(int i=0; i<word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: "+word);
                    break;
                }
            }else{
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }
        }

        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: "+word);
        }
        scanner.close();
    }
    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                  
                  
                  
                  """;
            case 1 -> """
                  o
                  
                  
                  """;
            case 2 -> """
                  o
                  |
                  
                  """;
            case 3 -> """
                  o
                 /|
                  
                  """;
            case 4 -> """
                  o
                 /|\\
                  
                  """;
            case 5 -> """
                  o
                 /|\\
                 /
                  """;
            case 6 -> """
                  o
                 /|\\
                 / \\
                  """;
            default -> " ";
        };
    }
}
