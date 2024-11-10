interface StringLengthCalculator{
    public int length(String str);
}
public class Question7 {

    public static void main(String[] args) {
        StringLengthCalculator str1 = (String str) ->{
            return str.length();
        };


        int length = str1.length("Jayavel");
        System.out.println(length);
    }
    
}
