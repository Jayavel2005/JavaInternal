// package JavaInternal.Collections;
import java.util.Collections;
import java.util.*;
public class Question5 {
   public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    int size = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < size; i++) {
        myList.add(scanner.nextLine());
    }

    Collections.sort(myList);
    System.out.println(myList);
   }

    
}
