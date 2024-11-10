interface NumberChecker{
    public boolean isEven(int n);
}
public class Question6 {
    public static void main(String[] args) {
        NumberChecker checkNum = (int n) ->{
            if(n % 2 == 0)
            {
                return true;
            }
            else{
                return false;
            }
        };

        System.out.println(checkNum.isEven(5) ? "True" : "False");
    }
}
