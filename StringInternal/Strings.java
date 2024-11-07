import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        // Palindrome String
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        word.replaceAll("[^a-zA-Z]", "");

        // String reversed = "";
        // for(int i = word.length() - 1; i >=0 ;i--  ){
        //     reversed += word.charAt(i);
        // }
        // if(word.equals(reversed)){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }


        if (isPalindrome(word)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }


        
        
    }

    public static boolean isPalindrome(String word){
        int start = 0;
        int end = word.length() - 1;

        while (start<=end) {

            if(word.charAt(start) != (word.charAt(end))){
                return false;
            }
            start++;
            end--;
            
        }
        return true;

    }
}