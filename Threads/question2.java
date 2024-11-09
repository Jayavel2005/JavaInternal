class Counter{
    private int count = 0;

    synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

class CounterHead extends Thread{
    Counter counter;

    CounterHead(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i = 1;i<=100;i++){
            counter.increment();
        }
    }
}
public class question2 {
    
    public static void main(String[] args) {
        Counter counter = new Counter();

        CounterHead t1 = new CounterHead(counter);
        CounterHead t2 = new CounterHead(counter);

        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Final counter value: " + counter.getCount());
    }
    
}
