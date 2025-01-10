package Collection.Map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTablleLearn {
    public static void main(String[] args) throws InterruptedException {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        //Hashtable is synchronized9Thread safe)
        // In hashtable neither the value or neither the key can be null
        // Legacy class removed by ConcurrentHashMap
        //slower tha HashMap
        // Only Linked List in case of collision

        hashtable.put(1,"Apple");
        hashtable.put(2,"Mango");
        hashtable.put(3,"Orange");
        hashtable.put(4,"Guava");
      //  hashtable.put(null,"ABC"); // Exception can't have null key

       // hashtable.put(5,null); // Exception can't have null value

        System.out.println(hashtable);

        // Concurrency example

        HashMap<Integer,String> map=new HashMap<>();
        Hashtable<Integer,String> map1=new Hashtable<>();

        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                map.put(i,"Thread1");
                map1.put(i,"Thread1");
            }
        });

        Thread t2=new Thread(()->{
            for(int i=1000;i<2000;i++){
                map.put(i,"Thread1");
                map1.put(i,"Thread1");
            }});

            t1.start();
            t2.start();

            t1.join();
            t2.join();

        System.out.println(map.size()); // Not expected value value  with hash Map

        System.out.println(map1.size()); //count -2000 avoids race condition



    }
}
