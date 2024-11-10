// package JavaInternal.Generics;
interface Pair<K,V>{
    K getValue();
    V getKey(); 
}

class OrderedPair<K,V> implements Pair<K,V>{
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getValue(){
        return key;
    };

    public V getKey(){
        return value;
    };
}
public class Question3 {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new OrderedPair(56, "befsgw");
        System.out.println(pair.getKey());
    }
    
}
