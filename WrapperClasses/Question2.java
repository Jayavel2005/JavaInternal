// package JavaInternal.WrapperClasses;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Double result;
        try{
            result = Double.parseDouble(s);
            System.out.println(result);
        }
        catch(NumberFormatException e){
            System.out.println("INvalid string: "+e.getMessage());
        }
    }
}