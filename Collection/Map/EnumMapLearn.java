package Collection.Map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAAY,SUNDAY
}

public class EnumMapLearn {
    public static void main(String[] args) {
        // array of size same as enum
        //no hashing
        //ordinal/index is used
        //Faster than HashMap
        //Memory efficient
        Map<Day,String > map=new EnumMap<>(Day.class);
        /*If all the keys in a Map are values from a single enum, it is recommended to use an EnumMap
        as the specific implementation. An EnumMap, which has the advantage of knowing all possible keys in advance,
         is more efficient compared to other implementations,
        as it can use a simple array as its underlying data structure.
         */
        // map automatically get how many values are there and there is no need for resizing

        map.put(Day.TUESDAY,"GYM"); // No hascode is required as these are directly mapped to index of enum ordinals
        map.put(Day.MONDAY,"Temple");

        System.out.println(map); // Insertion order also maintained here


        System.out.println(Day.TUESDAY.ordinal());





    }
}
