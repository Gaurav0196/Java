package Collection.Map.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> hashMap=new ConcurrentHashMap<>();

        //Java 7 --> Segment based locking --> Map is divided into segments of smaller Hashmaps
        //By default  to 16 segments. All segments are independently locked
        //Only the segment being written to or read from is locked
        //read: do not require locking unless there is a write operation on the same segment
        // write ; segment Lock



        //Java 8--> no segmentation as there 16 segments only and it is difficult to scale.As if our HashMap is
        // quite big then there will be lots of waiting
        // After Java 8 it uses Compare and Swap approach --> no locking except resizing of hashmap
        //happening or collision

        /*
Thread A reads x: Thread A observes that the value of x is 42.

Thread A wants to update x: Thread A's task is to update x to 50, but only if x is still 42 (the value it last saw).

Compare and Swap:

Compare: Check if the current value of x is still 42.

Swap: If x is still 42, update it to 50.

Fail: If x is no longer 42 (maybe another thread changed it), then do not update x to 50. Instead, retry the operation.



let's continue with the scenario where another thread updates the value of x to 45.

Initial Read by Thread A: Thread A reads the value of x and sees that it is 42.

Another Thread Updates x to 45: Before Thread A can perform the CAS operation, another thread (let's call it Thread B) comes along and updates the value of x to 45.

Thread A Performs CAS:

Compare: Thread A compares the current value of x (now 45) with the expected value (42).

Fail: Since 45 is not equal to 42, the CAS operation fails. Thread A does not update x.

Next Steps:
Retry the Operation: Thread A realizes the CAS operation failed and retries. It reads the new value of x (45) and attempts the CAS operation again.

Second Compare and Swap:

Compare: Thread A now compares the current value of x (45) with the new expected value (45).

Swap: If the current value of x is still 45, Thread A updates it to 50.


IF CAS is failing multiple times the  thread will back off and retry after short random time
         */




        //

        /*
        Steps for CAS-based put Operation:
Read the Index: Read the current value at the target index (or bucket).

Check if Empty: Determine if the index is empty (i.e., no entry exists at that index).

Compare and Swap:

Compare: Compare the current value at the index with the expected value (i.e., empty).

Swap: If the index is empty, insert the new entry.

Fail: If the index is not empty (another thread may have inserted an entry), retry the operation.
         */
// In Concurrent has map incremental resizing happens



        // map->sorted->thread safe -->concurrentskiplist map(Data is stored in data structure skip List)

        // SkipList-> probabilistic data structure that allows for efficient search,insertion and deletions operation

        // It is similar to a sorted linked list but with multiple layers that skip over portions of the list to
        //provide faster access to he element




    }
}
