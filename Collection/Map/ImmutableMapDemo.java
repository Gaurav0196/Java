package Collection.Map;

/*
Map whose content can't be change/modified once it is instantiated.
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        map.put("A",1);
        map.put("B",2);
        System.out.println(map);
        Map<String, Integer> map1 = Collections.unmodifiableMap(map);
        System.out.println(map1);// map is view of map1 if map is changed then map1 also gets change
      //  map1.put("C",3); // Exception as map1 is unmodifiable

        //Cleaner way to create unmodifiable/immutable map map

        Map<String, Integer> map2 = Map.of("A", 1, "B", 2, "C", 3, "D", 4);
       //Map.of is limitaed to 10 key value pairs only
    //    map2.put("E",5); // exception
        System.out.println(map2);

        //Map.of is limited to 10 key value pairs only. For more than 10 entries Map.ofentries is used

        System.out.println(Map.ofEntries(Map.entry("a",1),Map.entry("b",2)));

    }
}
