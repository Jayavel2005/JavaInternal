interface StringOperation{
    public String StringConcat(String a, String b);
}

public class Question5 {

    public static void main(String[] args) {
        StringOperation str1 = (String a, String b) -> {
            return a.concat(b);
        };


        System.out.println(str1.StringConcat("Jaya ", "vel"));
    }
}