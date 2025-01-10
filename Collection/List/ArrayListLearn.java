package Collection.List;

// When to use List: -when we require ordered collection of elements and duplicates value allowed

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListLearn {

    /*
    An arraylist is a resizeable array implementation of List interfaces.
    unlike arrays in java,which have fixed size and arraylist can change its size dynamically
    as elements are added or removed. This flexibility makes its popular choice when the
    no. of elements isn't known in advance.

    //Use based indexing is using in arraylist
     */


    public static void main(String[] args) {
//
//        List<Integer> list=new ArrayList<>(2); // 2 is initial capacity i.e when size >2 Arraylist
//        // will automatically create new array with increase size internally
//
//        list.add(2);
//
//        list.add(10);
//
//        list.add(50);
//
//        System.out.println(list.get(0));
//
//        System.out.println(list.remove(2));
//
//        list.set(0,20); // replace value at index 0 with 20
//
//        list.add(1,30); // Element added at index 1 and now 10 has index 2
//
//        System.out.println(list.contains(20));
//
//        System.out.println(list); // This will also print list as it uses toStringMethod
//
//        System.out.println(list.size());
//
//        for(int i:list){
//            System.out.println(i);
//
//
//
//        }


        List<String> list1 = Arrays.asList("Hello", "World");
        System.out.println(list1.getClass().getName()); //java.util.Arrays$ArrayList

       // ArrayList<String> list2=Arrays.asList("Hello", "World"); // Throws error as .asList returns List type
     //   objects not Arraylist


        //list1.add("Hi");// Throws Runtime time error as it Returns a fixed-size list backed by the specified arra

       list1.set(0,"Hi"); // but this works

        System.out.println(list1);

        String[] s={"hello","world"};


        List<String> list2=Arrays.asList(s);

        System.out.println(list2);
        // if we want to make list modifiable

        ArrayList<String> l=new ArrayList<>(list2); //[hello, world, Hi, hello, world]


        l.add("Hi");

        l.addAll(list2);

        System.out.println(l);




        List<Integer> integers = List.of(1, 2, 3); // return unmodifiable list

        // integers.set(1,33); // exception not able to set as it is immutable list

        ArrayList<Integer> objects = new ArrayList<>();
         objects.add(1);
         objects.add(2);
         objects.add(3);

        objects.remove(1); // here index is passed

        objects.remove(Integer.valueOf(3)); // here value is passed and this removes method has object as argument

        System.out.println(objects);


        // Converting to Array

        String[] array = list1.toArray(new String[0]);
        System.out.println(array[0]);

        // Sorting a List

        List<Integer> integers1 = List.of(34, 23, 45, 6, 45, 2,67);

        ArrayList<Integer> sortList=new ArrayList<Integer>(integers1);

        //Collections.sort(integers1); // error immutable object passed when mutable expected

        //Collections.sort(sortList); // This works
        //Another way

        sortList.sort(null);

        System.out.println(integers1);

        System.out.println(sortList);






/*
       Internal Working of Arraylist-

       Unlike a fixed array which ahs fixed size an ArrayList can grow and shrink
       as elements are added or removed .This dynamic resizing is achieved by creating
       a new array when current array is full and copying the elements to the new array.


       Internally,the ArrayList is implemented as an array of object reference .
       When you add elements to an Array you're essentially storing these elements in internal array.

       When you create an ArrayList,it has an initial capacity(default is 10).The capacity
       refers to the size of the internal array that can hold elements before needing to resize.
       capacity!=size

       Adding elements to Arraylist:
       When we add an element to an arrayList ,the following steps occurs:

       Check capacity: Before adding the new element ,ArrayList checks if there is enough space in the
       internal array(elementData) If the array is full,it needs to be resized

       Resize if  necessary: If the initial array is full,The ArrayList will create a new array with
       with larger capacity(usually 1.5 times the current capacity) and copy the elements from the
       old array to the new array.


       Add the element : The new element is then added to the internal array at the appropriate
       index and the size is increased

       Resizing the array:

       Initial capacity: By default,the initial capacity is 10. This means the internal array can hold
       10 elements before it needs to grow

       Growth factor: When the internal array is full, a new array is created with the size 1.5 times the
       old array. The growth factor balances memory efficiency and resizing cost


       Copying elements: When resizing occurs ,all the element from the old arrays are copied to the new Array,
       which is O(n) operation where n is the number of elements in the arrayList



       Removing the Elements:

       Check Bounds: The Arraylist first checks if the index is within the valid range

       Remove the element: The element is removed ,and all the elements to the right of the removed
       element ar shifted one position left to fill the gaps.


       Reduce the size: The size decremented by 1.


       Time complexity

       i. Access by index get iso(1)
       ii. Adding an element is o(n) is the worst case when resizing occurs
       ii. Removing elements can be O(n) because it may involve shifting elements
       iV. Iteration is O(n)

       Internal Working: When you call get(int index):

The method checks if the index is within the bounds of the array.
If the index is valid, it directly accesses the element at the index using array indexing
(constant time operation, O(1)).
If the index is out of bounds, it throws an IndexOutOfBoundsException.

Performance: get(int index) is very fast for ArrayList because it directly accesses the array element.

The RandomAccess interface is a marker interface in Java used to indicate that a List supports fast
(constant time) random access to elements.








*/


    }
}
