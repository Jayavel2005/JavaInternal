import java.util.Scanner;

public class Code1 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the value: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                System.out.println("The Addition : " + (number1 + number2));
                
                break;

            case 2:
                System.out.println("The Addition : " + (number1 - number2));
                break;
            
            case 3:
            System.out.println("The Addition : " + (number1 * number2));

                break;

            case 4:
                try{
                    int result = number1 / number2;
                    System.out.println("The Division: " + result);
                }
                catch(Exception e){
                    System.out.println("Number can't divided by zero." + e.getMessage());
                }
        
            default:
                break;
        }
    }
}
