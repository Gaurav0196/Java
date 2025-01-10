package Collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {

  LRUCache<String,Integer> linkedHashMap1=new LRUCache<>(3);

        // Here access order maintained7
        linkedHashMap1.put("Apple",1);
        linkedHashMap1.put("Orange",2);
        linkedHashMap1.put("Guava",3);

        System.out.println(linkedHashMap1);

        //No when we add fourth entry to LinkedHashMap it will remove Least used entry

        linkedHashMap1.put("Watermelon",4);

        linkedHashMap1.get("Apple"); // no change in map as when put method was performed then entry of apple already removed
 // get put method mean using entries
        System.out.println(linkedHashMap1);



    }
}
