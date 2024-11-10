import java.util.Scanner;
import java.io.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathName = scanner.nextLine();
        File file = new File(pathName);

        if(file.exists()){
            if(file.isFile()){
                if(file.canWrite()){
                    System.out.println("The file has write operation.");
                }
                else{
                    System.out.println("The file has only read Operation.");
                }
            }
            else if(file.isDirectory()){
                if(file.canWrite()){
                    System.out.println("The file has write operation.");
                }
                else{
                    System.out.println("The file has only read Operation.");
                }
            }
        }
        else{
            System.out.println("The file is not exist");
        }
    }
}
