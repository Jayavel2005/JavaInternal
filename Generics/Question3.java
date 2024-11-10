interface Pair<K,V>{
    K getKey();
    V getValue();
}


class OrderPair<K, V> implements Pair<K,V>{
    K k;
    V v;

    OrderPair(K k,V v){
        this.k = k;
        this.v = v;
    }

    public K getKey(){
        return k;
    }

    public V getValue(){
        return v;
    }
}


public class Question3 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderPair("de", 45);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
    
}