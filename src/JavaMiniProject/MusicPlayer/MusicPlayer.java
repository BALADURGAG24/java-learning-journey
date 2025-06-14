package JavaMiniProject.MusicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args){

        String filePath = "src/JavaMiniProject/MusicPlayer/Minnalvala(KoshalWorld.Com).wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

//            clip.start();

            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();
                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice!");
                }
            }
//            System.out.println("No problems detected");

        } catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        } catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        } catch (IOException e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Bye!");
        }
    }
}
