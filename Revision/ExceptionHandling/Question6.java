import java.util.HashSet;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet mList = new HashSet<>();
        int count = scanner.nextInt();
        try{
            for (int i = 0; i < count; i++) {
                int number = scanner.nextInt();
                if (mList.contains(number)) {
                    throw new Exception("Duplicate element occurs");
                }
                else{
                    mList.add(number);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    } 
    
    
}
