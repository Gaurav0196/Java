package Collection.Sets;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        // Set is a collection that cannot contain duplicate elements
        // Based on principle of HashMap hence for find -o(1) and insert O(1)
        //faster operation
        // Map-> HashMap,LinkedHashMap,TreeMap,EnumMap
        // Set--> HashSet,LinkedHashSet,TreeSet,EnumSet

        //HashSet--> Internal working similar to HashMAap just value is dummy

        //Each element in the HashSet is stored as a key in the HashMap, while the value in the HashMap is a constant
        // placeholder (typically Boolean.TRUE).

        // HashSet(Values)-->Key of HashMap

        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);
        System.out.println(set); //Unordered Just like HshSet


        // LinkedHashSet for order elements
        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(12);
        set1.add(1);
        set1.add(1);
        set1.add(67);

        System.out.println(set1); //Ordered


        // Sorted Order
        Set<Integer> set2=new TreeSet<>();
        set2.add(12);
        set2.add(1);
        set2.add(1);
        set2.add(67);

        System.out.println(set2); // We acn NavigableSet<Integer> set =new TreeSet(); to get more utility methods

        // For Thread safety

       // Collections--> Static class

        Set<Integer> integerSet = Collections.synchronizedSet(set2);//
        // To make these set,map and any collection synchronized use Collections.synchronized
        // This will wrap the set/collection within the synchronized block
        // performance overhead .Avoid use Instead use ConcurrentSkipListSet

        //that has built in thread safety

        Set<Integer> skipListSet=new ConcurrentSkipListSet<>();

        // Unmodifiable Set
        Set<Integer> unmodifiableSet = Set.of(1, 2, 2, 3, 3, 4); // we can have more than 10 entries

        Collections.unmodifiableSet(set2); //Makes set2 unmodifiable





    }}
