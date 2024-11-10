import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question5 {
    public static void main(String[] args) {
        try
        {
            BufferedReader srcFile = new BufferedReader(new FileReader("Jayavel.txt"));
            FileWriter desFile = new FileWriter("output.txt");

            String line = srcFile.readLine();

            while (line != null) {
                // desFile.write(line);
                // desFile.write(System.lineSeparator());
                System.out.println(line);
                line = srcFile.readLine() ; 
                System.out.println("COntent copyied succesfully"); 
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }    
}
