// package JavaInternal.Generics;

public class Question2 {
    
    public static <Thing> void printArry(Thing[] array){
        for (Thing thing : array) {
                System.out.print(thing + " ");
        }
    }
    public static void main(String[] args) {
        
        Integer[] intArray = {1,2,3,4,5,6};
        printArry(intArray);
        System.out.println();
        String strArray[] = {"HAa","fsrwgwr","sfgwgwrg","gwrgwg"};
        printArry(strArray);
        System.out.println();
        Double doubleArray[] = {3.4, 5.6, 8.54};
        printArry(doubleArray);
     }  
}
