// package JavaInternal.FileHandling;
import java.io.*;
public class fileRead {
    public static void main(String[] args) {
        // File file = new File("D:/Jayavel.txt");
        // if(file.exists()){
        int count = 0;
            try{
                FileReader newFile = new FileReader("D:/Jayavel.txt");
                int c = newFile.read();
                while (c != -1) {
                    System.out.print((char)c);
                    count++;
                    c=newFile.read();
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());   
            }
        }
        
    }

