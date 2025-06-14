package Files.ReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String filePath = "C:\\Users\\indep\\Desktop\\test.txt";

        try( BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            System.out.println("That file exists");
            System.out.println();
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        } catch (IOException e){
            System.out.println("Something went wrong");
        }
        scanner.close();
    }
}
