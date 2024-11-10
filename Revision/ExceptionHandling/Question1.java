// package ExceptionHandling;

import java.util.Scanner;

public abstract class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("The result is: "+ result); 
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }   
}
