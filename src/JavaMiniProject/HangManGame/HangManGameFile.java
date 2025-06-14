package JavaMiniProject.HangManGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangManGameFile {
    public static void main(String[] args){

        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }catch(FileNotFoundException e){
            System.out.println("Could not find file");
        }catch(IOException e){
            System.out.println("Something went wrong");
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
//        System.out.println(word);

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
