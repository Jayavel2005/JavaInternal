import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // String creation using litetrals
        String myName = "Jayavel";
        System.out.println(myName);

        // String creation using new keyword
        String myName1 = new String("Jayavel");
        System.out.println(myName1);

        System.out.print("Enter the Word: ");
        String word = scanner.nextLine();
        // Finding length
        System.out.println(word.length());
        // Finding Any Char using index
        System.out.println(word.charAt(0));
        
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        // Compare Two Strings

        String word1 = new String("Jaavel");
        String word2 = new String("Jaavel");
        System.out.println(word1.equalsIgnoreCase(word2));


    }
}
