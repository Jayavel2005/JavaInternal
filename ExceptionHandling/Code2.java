import java.util.Scanner;

public class Code2 {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the array size: ");
    int size = scanner.nextInt();
    int arr[] = new int[size];

    for(int i = 0;i<size;i++){
        
        System.out.print("Enter the value for " + i + ": ");
        arr[i] = scanner.nextInt();
    }

    try{
        System.out.print("Enter the index value to acces element in array: ");
        int index = scanner.nextInt();
        int value = arr[index];
        System.out.println("The value is : "+ value);
        scanner.close();

    }catch(ArrayIndexOutOfBoundsException e){
        // System.out.println(e.getMessage());
        System.out.println("Out of index...");
    }

 }   
}
