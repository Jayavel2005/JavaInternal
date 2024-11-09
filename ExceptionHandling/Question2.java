import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();
        odd(num);

    }
    public static void odd(int num){  
        try{

            if(num % 2 == 0){
                System.out.println("It is an Even number..");
            }
            else{
                throw new Exception("The number is odd..");
            }
        }
        catch(Exception e){
            System.out.println("The number is odd..");
        }
    }
}
