package Collection.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapLearn {
    public static void main(String[] args) {
        // Regular has Hash map
        Map<String,Integer> hasMap=new HashMap<>();
        String key1=new String("key");
        String key2=new String("key");

        hasMap.put(key1,1);
        hasMap.put(key2,2);

        //Here hashcode and equals method of String class called >hence 2nd entry removes 1st entry in map

        System.out.println(hasMap);

        // Identity hashMap

        Map<String,Integer> identiMap=new IdentityHashMap<>();

        // In identity hashMap hahscode of object is used and == used to check equality
        //IdentifyHashCode and ==

        identiMap.put(key1,1);
        identiMap.put(key2,2);

        System.out.println(identiMap);


    }
}
