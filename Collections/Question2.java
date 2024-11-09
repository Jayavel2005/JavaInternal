// package JavaInternal.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        System.out.println("Enter the size of list: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value: ");

            myList.add(scanner.nextInt());
        }

        if(!myList.isEmpty()){
            System.out.println("The max element is : " + Collections.max(myList));
        }else{
            System.out.println("Empty...");
        }
        if(!myList.isEmpty()){
            System.out.println("The max element is : " + Collections.min(myList));

        }else{
            System.out.println("Empty...");
        }

        int sum = 0;
        for(Integer el : myList){
            sum += el;
        }
        System.out.println("The sum of elements: "+ sum);
    }
}
