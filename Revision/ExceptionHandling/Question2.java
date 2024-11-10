import java.util.Scanner;

public class Question2 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            isEven(number);
            
        }   
        public static void isEven(int a){
            try{
                if(a % 2 != 0){
                    throw new Exception("The number is not even");
            }
            else{
                System.out.println("The number is even");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
