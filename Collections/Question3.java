import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        HashSet<Integer> uniqySet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = scanner.nextInt();
        for(int i = 0;i<size;i++){
            mylist.add(scanner.nextInt());
        
        }
        uniqySet.addAll(mylist);
        System.out.println(uniqySet);

    }

}
