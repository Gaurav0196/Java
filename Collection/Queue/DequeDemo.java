package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

//Double Ended Queue
public class DequeDemo {
    public static void main(String[] args) {
        //double-ended queue
        // allows insertion and removal of elements from both end
        // versatile than regular queues and stacks because they support all the operation of both stack and queue

        /*
        INSERTION METHOD:
        addFirst(E e): Insert the specified element at the front.
        addLast(E e): Insert the specified element at the end
        offerFirst(E e): Inserts the specified element at the front if possible
        offerLast(E e0: Inserts the specified element at the end if possible

         */

        /*
        REMOVAL METHODS:
        removeFirst(): Retrieves and removes the first element
        removeLast() : Retrieves and removes the last element
        pollFirst(): Retrieves wnd removes the first element,or return null if empty
        pollLast: Retrieves and removes the last element,or return null if empty
         */

        /*
        Examination Method:

        getFirst(): Retrieves ,but does not remove,the first element
        getLast(): Retrieves ,but does not remove,the last element
        peekFirsts(): Retrieves ,but does not remove ,the first element,or returns null if empty
        peekLast(): Retrieves, but does not,remove the last element,or returns null if empty
         */

        /*
        Stack Methods:
        push(E e): Adds an element at the front(equivalent to addFirst(E e)).
        pop(); Removes and return the first element(equivalent to  removeFirst())
         */

        Deque<Integer> deque1=new ArrayDeque<>(); //Faster iteration,low memory,no  null allowed .Hence ArrayDeque>LinkedList
        //Here Circular array is used,head and tail pointer used
        // no need to shift elements

        // Array Deque-Resizable-array implementation of the Deque interface
        //This class is likely to be faster than Stack when used as a stack, and faster than
        // LinkedList when used as a queue.
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        //5,10,20,25
        System.out.println("Deque: "+deque1);
        System.out.println("First Element: "+deque1.getFirst()); //5
        System.out.println("Last Element: "+deque1.getLast()); //25
        deque1.removeFirst(); //Removes 5
        deque1.pollLast(); //Removes 25
        System.out.println("Deque: "+deque1);
        for(int num:deque1){
            System.out.println(num);
        }

        Deque<Integer> deque2=new LinkedList<>(); //use where want to insert,delete element in somewhere middle












    }
}
