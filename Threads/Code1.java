// class A extends Thread{
//     public void run(){
//         for(int i = 1;i<=5;i++){
//             System.out.println(i);
//             try{
//                 Thread.sleep(500);
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i = 1;i<=5;i++){
//             System.out.println(i);
//             try{
//                 Thread.sleep(500);
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }
// public class Code1 {

//     public static void main(String[] args) {
        
//         A w = new A();
//         B u = new B();
//         w.start();
//         u.start();

//     }
// }
class A implements Runnable{
    public void run(){
        for(int i = 0;i<5;i++ ){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
class B implements Runnable{
    public void run(){
        for(int i = 0;i<5;i++ ){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Code1{
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        
    }
}