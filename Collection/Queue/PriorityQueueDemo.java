package Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //part of Queue Interface
        // orders elements based on their natural orderings (for primitive lowest first)
        //custom comparator for customized ordering
        // does not allow null elements

        System.out.println("Priority Queue Starts: ");
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);

//        System.out.println(pq.peek()); //5
//
//        // next priority
//
//        System.out.println(pq.remove()); //5 removed
//        System.out.println(pq.peek()); //10
        // Focus on Head element(By natural ordering  most priority element will be on Head)
        while (!pq.isEmpty()){
            System.out.println(pq.poll()); //5,10,15,30
        }

        //internal working
        // PriorityQueue is implemented as a min-heap by default(for natural ordering)

        // Min-Heap(tree)-> Each node will be eiter equal to or less than child node value.
        // Insert,Remove-->O(Logn) and peek->o(1)

        System.out.println("Cutom order logic Priority Queue Starts: ");
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(15);
        pq1.add(10);
        pq1.add(30);
        pq1.add(5);

        while (!pq1.isEmpty()){
            System.out.println(pq1.poll()); //30,15,10,5
        }

    }
}
