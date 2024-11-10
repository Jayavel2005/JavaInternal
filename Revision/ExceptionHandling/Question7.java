import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        try{
            for(int i = 0; i< word.length();i++){
                char c = word.charAt(i);
                if(!(word.contains("a"))){
                    throw new Exception("a is not there");
                }
            }
            System.out.println("A is occured");
        }
        catch(Exception e){
            System.out.println("The dvwfbwfbwof");
        }

    }
}
