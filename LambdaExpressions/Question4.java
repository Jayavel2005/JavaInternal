interface MaxFinder{
    public int findMax(int a , int b);
}
public class Question4 {
    public static void main(String[] args) {
        MaxFinder find = (int a, int b) -> {
                if(a > b){
                    return a;

                }
                else{
                    return b;
                }
            };

            System.out.println("Max : " + find.findMax(4, 5));
        };

        
    }   

