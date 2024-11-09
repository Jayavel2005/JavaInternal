public class IntegerComparison {

    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // Creating two Integer objects
        Integer num1 = new Integer(100); 
        Integer num2 = new Integer(100);

        // Comparing using '=='
        System.out.println("Using '==': " + (num1 == num2)); // Comparing reference

        // Comparing using '.equals()'
        System.out.println("Using '.equals()': " + num1.equals(num2)); // Comparing value

        // Autoboxing example
        Integer num3 = 100;
        Integer num4 = 100;

        // Comparing using '==' with autoboxed Integer values
        System.out.println("Autoboxing - Using '==': " + (num3 == num4)); // Comparing reference
        
        // Comparing using '.equals()' with autoboxed Integer values
        System.out.println("Autoboxing - Using '.equals()': " + num3.equals(num4)); // Comparing value
    }
}
