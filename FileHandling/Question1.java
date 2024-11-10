// package JavaInternal.FileHandling;
import java.io.*;
import java.util.Scanner;;
public class Question1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String pathName = scanner.nextLine();
            File file = new File(pathName);

            if(file.exists()){
                if(file.isFile()){
                    System.out.println("It is a file");
                }
                else if(file.isDirectory()){
                    System.out.println("It is a directory");
                }
                else{
                    System.out.println("NO path name");
                }
            }
        }
}
