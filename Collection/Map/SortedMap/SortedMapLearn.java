package Collection.Map.SortedMap;

/*
SortedMap is an interface that extends Map and guarantees tha the entries are sorted based on the keys,
either in natural ordering or bya specified Comparator

 */

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapLearn {

    public static void main(String[] args) {

        SortedMap<Integer,String> sortedMap=new TreeMap<>();
        // it extends Map interface ,hence can be written as Map<Integer,String> map=new TreeMap<>();
        // but SortedMap provides some utility methods .Hence using that
        sortedMap.put(17,"Gaurav");
        sortedMap.put(1,"Saurav");
        sortedMap.put(25,"Vaibhav");
        sortedMap.put(2,"Gautam");



        System.out.println(sortedMap); //{1=Saurav, 2=Gautam, 17=Gaurav, 25=Vaibhav}

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(17)); //head not included
        System.out.println(sortedMap.tailMap(17)); // head included

        // Sorting in descending order

        SortedMap<Integer,String> map=new TreeMap<>((a,b)-> b-a);
        map.put(12,"Apple");
        map.put(1,"Guava");
        map.put(11,"Orange");
        map.put(8,"Watermelon");
      //  map.put(null,"ABC"); // Exception can't have null values since sorting is being done

        System.out.println(map); //  {12=Apple, 11=Orange, 8=Watermelon, 1=Guava}


        // TreeMap internally is Red Black Tree(Self balancing Binary Search Tree)>Here put and get has O(logn) complexity


      // except contains value that will be O(n)


      // Navigable Map extends Sorted map


      /*
      NavigableMap extends SortedMap,providing more powerful navigation options such as finding the closet
      matching key or retrieving the map in reverse order
       */

        NavigableMap<Integer,String> navigableMap=new TreeMap<>();

        navigableMap.put(12,"Apple");
        navigableMap.put(1,"Guava");
        navigableMap.put(11,"Orange");
        navigableMap.put(8,"Watermelon");
        System.out.println("--navigable Map");
        System.out.println(navigableMap); //{1=Guava, 8=Watermelon, 11=Orange, 12=Apple}

        System.out.println(navigableMap.lowerKey(13));//12- returns the greatest key strictly less tha given key
        System.out.println(navigableMap.ceilingKey(6));// 8

        System.out.println(navigableMap.higherKey(8)); //11

        System.out.println(navigableMap.higherEntry(8)); //11=Orange

        System.out.println(navigableMap.descendingMap()); //{12=Apple, 11=Orange, 8=Watermelon, 1=Guava}















    }
}
