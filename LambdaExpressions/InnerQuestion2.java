// package JavaInternal.LambdaExpressions;
interface Operation{
    public int addition(int a, int b);
}
public class InnerQuestion2 {

    public static void main(String[] args) {
        Operation add = new Operation() {
            @Override
            public int addition(int a, int b){
                return a + b;
            }
        };
        System.out.println(add.addition(5, 6));
    }

}