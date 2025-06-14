package JavaMiniProject.AlarmClock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run(){

     while(LocalTime.now().isBefore(alarmTime)){
         try {
             Thread.sleep(1000);
             LocalTime now = LocalTime.now();

             System.out.printf("\r%02d:%02d:%02d",
                     now.getHour(),
                     now.getMinute(),
                     now.getSecond());
         }
         catch (InterruptedException e) {
             System.out.println("Thread was interrupted");
         }
     }
        System.out.println("\n*ALARM NOISES*");
        playSound(filePath);
    }
    private void playSound(String filePath){
        File audioFile = new File(filePath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
//            Thread.sleep(5000);
            System.out.print("Press *Enter* to stop the alarm: ");
            scanner.nextLine();
            clip.stop();

            scanner.close();
        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio file format is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
        catch(IOException e){
            System.out.println("Error reading audio file");
        }
//        catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
