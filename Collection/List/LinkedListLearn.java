package Collection.List;

/*
A linkedList ia a linear data structure where each elements is a separate objects called a node.Each node
contains two parts:

Data; The value stored in node

Pointers: Two pointers ,one pointing to the next node(next) and the other pointing to the previous node(previous)

LinkedList class in java is a part of the collection framework and implements the list interface.
Unlike an ArrayList, which uses a dynamic array to store the elements, a LinkedList stores its element
as nodes in a doubly linked list. This provides different performance characteristics and usage.

Since LinkedList doesn't have contagious memory allocation like array fetching elements is lower than arraylist

As we have to loop through the head of linked list to given index to fetch the value.


Adding and removing elements in LinkedList works better tha ArrayList as we have to point
next and previous nodes only of required value .


------------------------Performance Considerations-------------------------

Insertions and Deletions: LinkedList is better for frequent insertions and deletions in the middle of list
because it does not require shifting elements ,as in Arraylist


Random Access: LinkedList has slower random access(get(int index)) compared to ArrayList because it has to
traverse list from beginning to read the direct index. O(n) while in array O(1)


Memory Overhead: LinkedList requires more memory than ArrayList because each node in a Linked list
requires extra memory to store reference to the next and previous nodes



 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListLearn {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(); // default constructor <no capacity parameter

        list.add(1);

        list.add(2);

        list.add(3);

        System.out.println(list.get(2)); //O(N)

        list.addFirst(0);  // This method is not present in arraylist  O(1)

        list.addLast(4);  // // This method is not present in arraylist O(1)

        System.out.println(list);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        list.remove(1);
        list.removeFirst();
        list.removeLast();

        System.out.println(list
        );

        list.add(4);

        list.add(5);

        list.removeIf(x->x%2==0); // Remove if even

        System.out.println(list
        );


        // Converting ArrayList to LinkedList

        LinkedList<String> fruits=new LinkedList<>(List.of("Apple","Banana","Guava","Watermelon"));


        LinkedList<String> fruitsToRemove=new LinkedList<>(List.of("Apple","Banana"));

        fruits.removeAll(fruitsToRemove);

        System.out.println(fruits);

        // If we go with List<String> fruits then we won't be able to access addFirst(),addLAst()

        //LinkedList specific methods as we those methods are not present in List interface







    }


}


