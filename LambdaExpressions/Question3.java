// package JavaInternal.LambdaExpressions;

import java.util.Scanner;

interface MathOperation{
    public double operate(double num1, double num2);
}
public class Question3 {

    public static void main(String[] args) {
        MathOperation res = (double num1, double num2) ->{
                return num1 * num2;
            };
            
            Scanner scanner = new Scanner(System.in);
            double num1  = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            System.out.print(res.operate(num1, num2));
        }


    }
    
