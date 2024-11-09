// package JavaInternal.WrapperClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i<size;i++){
            list.add(scanner.nextLine());
        }
        for (String string : list) {
            try{
                list2.add(Integer.parseInt(string));
            }catch(NumberFormatException e){
                System.out.println("Invalid input: "+ e.getMessage());
            }
        }

        System.out.println(list2);
    }
    
}