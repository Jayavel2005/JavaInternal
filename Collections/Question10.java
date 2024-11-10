import java.util.*;;
public class Question10 {
    public static void main(String[] args) {
        HashSet<Integer> myList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of elements: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <  size; i++) {
            myList.add(scanner.nextInt());   
        }

        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
