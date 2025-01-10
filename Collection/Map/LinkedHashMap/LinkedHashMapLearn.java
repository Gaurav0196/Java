package Collection.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLearn {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(11,0.8f,false); // it extends hashmap
      //here insertion order maintained Default value)
        linkedHashMap.put("Apple",1);
        linkedHashMap.put("Orange",2);
        linkedHashMap.put("Guava",3);

        HashMap<String,Integer> hashMap=new HashMap<>();

        hashMap.put("Apple",1);
        hashMap.put("Orange",2);
        hashMap.put("Guava",3);

        System.out.println("---HashMap---");

        for(Map.Entry<String,Integer> e:hashMap.entrySet()){
            System.out.println(e.getKey() + " : "+e.getValue()); // No order maintained
        }


        System.out.println("---LinkedHashmap with Insertion order---");

        for(Map.Entry<String,Integer> e:linkedHashMap.entrySet()){
            System.out.println(e.getKey() + " : "+e.getValue()); // order maintained
        }

        // LinkedHashMap uses doublylinkedList along with array like hashmap , which keeps the entries in insertion order.
        // LinkedHashmap is slow as compared to HashMap due to overhead of doubly linked list

        /*
        access order in linkedHashMap Constructor:

        The ordering mode --true for access order

        false-- for insertion order
         */

        LinkedHashMap<String,Integer> linkedHashMap1=new LinkedHashMap<>(11,0.8f,true);

        // Here access order maintained7
        linkedHashMap1.put("Apple",1);
        linkedHashMap1.put("Orange",2);
        linkedHashMap1.put("Guava",3);

        linkedHashMap1.get("Orange");// Here we are getting orange value since we have enable access order this entry will
        //now move to last

        // Least Recently used principle used --> entries which are not used frequently will go to top

        System.out.println("---LinkedHashmap with Access Order---");

        for(Map.Entry<String,Integer> e:linkedHashMap1.entrySet()){
            System.out.println(e.getKey() + " : "+e.getValue()); // order maintained
        }

        // Converting Hashmap to LinkedHashmap

        LinkedHashMap<String,Integer> linkedHashMap2=new LinkedHashMap<>(hashMap);
        // The order is not predictable due to HashMap's nature.LinkedHashMap maintains the order in which
        // the entries are retrieved from the HashMap.
        System.out.println("Converting Hashmap to LinkedHashmap");

        for(Map.Entry<String,Integer> e:linkedHashMap2.entrySet()){
            System.out.println(e.getKey() + " : "+e.getValue()); // order maintained
        }



        System.out.println(hashMap.getOrDefault("Watermelon",0)); // 0 default valeu
        System.out.println(hashMap.getOrDefault("Apple",0)); // 1

        hashMap.putIfAbsent("Apple",3); // Apple 3 will not be replace as apple is already present

        //if we use put only Apples's entry would get replaced

        System.out.println(hashMap);











    }
}
