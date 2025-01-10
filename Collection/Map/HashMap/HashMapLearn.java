package Collection.Map.HashMap;

// In java , a Map is an object that maps keys to values. It cannot contain duplicate keys and each key can map to at most
//one value. Think of it as a dictionary where you look up a word(key) to find its definition(value).

/*
Key Characteristics of map:
i. map doesn't extend Collection Interface

ii. Key-Value Pairs: Each entry in a map consists of a key and value.
3
iii. Unique Keys: No two entries can have the same key.

iv. Order : Some Implementations maintain insertion order(LinkedHashMap),natural order(TreeMap),or no order(HashMap)

 v. Unordered: Does not maintain any order of its elements.

 vi. Allows null Keys and Values: Can have null keys and multiple null values

 Vii. Not Synchronized: Not Thread-safe; requires external synchronization if  used in multithreaded context

 vii/ Performance: Offers constant-time performance (O(1)) for basic operations like get and put,assuming the has function
 disperses element property

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearn {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<>(12,0.6f);

        hashMap.put(1,"Akshit");

        hashMap.put(2,"Neha");

        hashMap.put(3,"Shubham");

        System.out.println(hashMap);

        String s = hashMap.get(3);
        System.out.println(s);

        String s1 = hashMap.get(10);
        System.out.println(s1);  // null

        System.out.println(hashMap.containsKey(2));

        // Iterating over map

//        Set<Integer> keys = hashMap.keySet();
//
//        for(int i:keys){
//            System.out.println(hashMap.get(i));
//        }

        for(int i: hashMap.keySet()){
            System.out.println(hashMap.get(i));
        }


        Set<Map.Entry<Integer,String>> entries= hashMap.entrySet();

        for(Map.Entry<Integer, String> entry:entries){

            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        hashMap.remove(1,"AKSHIT");
        System.out.println(hashMap);

        System.out.println(hashMap.remove(2,"ANAND")); // No Value of Anand mapped to key 2,hence won't be removed





    }
}
