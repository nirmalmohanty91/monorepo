package MyPreparation.collectionsinjava.MapPrograms.programs;

import java.util.Map;

public class CustomHashMapDesign {

    public static void main(String[] args){

    }
}

class MyMap<K, V>{

    private Map.Entry<K,V>[] buckets;
    private static final int INITIAL_CAPACITY = 1 << 4;

    public MyMap(){
        this(INITIAL_CAPACITY);
    }

    public MyMap(int capacity){
        this.buckets = new Map.Entry[capacity];
    }

    public void put(K key, V value){

      //  Map.Entry<K,V> entry = new Map.Entry<>(key,value,null);
        int bucket = key.hashCode() % buckets.length;
     System.out.println(bucket);

    }

}