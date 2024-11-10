// package JavaInternal.FileHandling;
import java.io.*;
import java.util.Scanner;
public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String filePath = scanner.nextLine();

        File file = new File("D:/Jayavel.txt");

        try{
            if(file.createNewFile()){
                System.out.println("File is created successfully at " + file.getAbsolutePath());
            }
            else{
                System.out.println(file.getAbsolutePath());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
    