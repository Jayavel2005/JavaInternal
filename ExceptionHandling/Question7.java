import java.util.Scanner;

public class Question7 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String word = new String();
        word = scanner.nextLine();
        scanner.close();
        VowelChecker(word);
    }

    public static void VowelChecker(String word){
        try{
            if( !(word.contains("a") ||  word.contains("e") ||  word.contains("i") ||  word.contains("o") ||  word.contains("u") ||  word.contains("A") ||  word.contains("E") ||  word.contains("I") ||  word.contains("O") ||  word.contains("U")))
                throw new Exception("The String does not containing Vowels..");
            System.out.println("The String containing Vowels..");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
