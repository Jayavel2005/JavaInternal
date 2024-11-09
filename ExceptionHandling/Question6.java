import java.util.HashSet;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        HashSet<Integer> set =  new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        try{
            for( int i = 0;i<size;i++){
                System.out.print("Enter the value: ");
                int number = scanner.nextInt();
                if(set.contains(number)){
                    throw new Exception("Duplicate element is there!..");
                }
                else{
                    set.add(number);
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
