// package JavaInternal.Collections;
import java.util.*;
public class QUestion1 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // myList.
        while (true) {
            System.out.print("Enter the Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter the String to add: ");
                    String addEl = scanner.nextLine();
                    addElement(addEl, myList);
                    break;
                case 2:
                        System.out.print("Enter the String to add: ");
                        String removeEl = scanner.nextLine();
                        removeElement(removeEl, myList);
                        break;
                case 3:
                    display(myList);
                    break;
                
                default:
                    System.out.println("Exiting........");
                    return;
    
    
    
                
            }
        }
    }
    public static ArrayList<String> addElement(String addEl, ArrayList<String> myList){      

            myList.add(addEl);
    

        
    }
    public static ArrayList<String> removeElement(String removeEl, ArrayList<String> myList){      

        if(myList.contains(removeEl)){
            myList.remove(removeEl);
            
        }
        else{
            System.out.println(removeEl + " not found in the list.");
        }
    }
    public static void display(ArrayList<String> myList){
        if(myList.isEmpty()){
            System.out.println("The list is empty.");
        }else{
            for(String word : myList){
                System.out.println(word);
            }
        }
    }
    
}
