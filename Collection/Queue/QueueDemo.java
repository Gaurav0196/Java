package Collection.Queue;

//A data structure that works on the FIFO(First-In-First-Out)

//Elements are added at the end and removed from front.

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        //Queue is an Interface whose implementation classes are LinkedList,PriorityQueue
        //LinkedList can act as queue as well

        System.out.println("Linked List implementation of Queue");

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1); // enqueue
        linkedList.addLast(2); // enqueue
        linkedList.addLast(3); // enqueue
        System.out.println(linkedList);

        Integer i = linkedList.removeFirst(); //deque
        System.out.println(i);
        System.out.println(linkedList); // 1 is removed from the list

        linkedList.getFirst(); //peek_>Head of Queue

        // To reduce complexity Java introduced Queue Interface

        // LinkedLis is implementation class of Queue Interface

        System.out.println("Queue Interface implementing Queue");

        Queue<Integer> queue=new LinkedList<>();
        // here only Queue Interface methods can be referred no specific to link list method will be used
        queue.add(1); // enqueue
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        System.out.println(queue.peek());

        queue.remove(); // removed 1 FIFO
        System.out.println(queue);

        Integer peek = queue.peek(); //gives top of queue

        System.out.println(peek); // 2

        Integer poll = queue.poll();// retrieve and remove head of Queue

        System.out.println(poll); //2
        System.out.println(queue);

        // Creating another queue
        System.out.println("Creating another QUEUE: ");
        System.out.println();
        Queue<Integer> queue1=new LinkedList<>();
        //System.out.println(queue1.remove()); // This will throw Exception as Queue is empty
        System.out.println(queue1.poll());// no exception as this will null

        System.out.println(queue1.peek()); //null
       // System.out.println(queue1.element()); //throws exception if queue is empty .Similar to peek but throws exception


        //Example to differentiate add and offer

        Queue<Integer> queue2=new ArrayBlockingQueue<>(2);

        //Here we can provide capacity that queue will be of size=2\

        queue2.add(1);
        queue2.add(2);
        //queue2.add(3); // Throws Exception QueueFull

        queue2.offer(3); //No exception thrown if capacity is full and returns false.offer also add element to queue







    }
}
