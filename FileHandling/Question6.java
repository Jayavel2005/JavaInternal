import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
       try{

            BufferedReader file = new BufferedReader(new FileReader("Jayavel.txt"));
            String c = file.readLine();
            while (c != null) {
                System.out.print(c);
                lineCount++;
                
                charCount+= c.length();


                String[] words = c.split("\\s+");
                wordCount += words.length;
                c = file.readLine();

            }
        
       }
       catch(IOException e){
        System.out.println(e.getMessage());
       }

       System.out.println(charCount);
       System.out.println(lineCount);
       System.out.println(wordCount);

    }
}
