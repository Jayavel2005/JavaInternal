

public class InnerQuestiomn1 {

    public static void main(String[] args) {
        Runnable a = () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        };
        Runnable b = () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
    
}