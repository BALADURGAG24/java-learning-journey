package Files.WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args){

        String filePath = "C:\\Users\\indep\\Desktop\\test.txt";
        String textContent = """
                Roses are Red
                Violets are Blue
                Booty Booty Booty
                Hello Coderss
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }
    }
}
