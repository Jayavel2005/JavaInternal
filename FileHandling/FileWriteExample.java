// import java.io.FileWriter;
// import java.io.IOException;

// public class FileWriteExample {
//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("output.txt"); // Creates a new file or overwrites if exists
//             writer.write("Hello, Jayavel!\n");
//             writer.write("This is a sample text file.\n");
//             writer.close(); // Close the writer to release resources
//             System.out.println("Successfully wrote to the file.");
//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }


import java.io.*;
public class FileWriteExample {

    public static void main(String[] args) {
        try{
            File myFile = new File("D:/Jayavel.txt");
            FileWriter file = new FileWriter(myFile);
            BufferedWriter newWriter = new BufferedWriter(file);
            newWriter.write("Jayavel is an boy");
            newWriter.close();
            System.out.println("File was successfully Writed.");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}