package Collection.List;

/*

Key Features of Vector

Dynamic Array: Like ArrayList,Vector is a dynamic array that grows automatically when more elements
are added then its current capacity

Synchronized: All the methods in vector are synchronized,which makes it thread-safe.
This means multiple threads can work on a vector without the risk of corrupting the data.However,this can

introduce performance overhead in single-threaded environments.

legacy Class:Vector was part of Java's original release and is considered a legacy class.
It's generally recommended to use ArrayList in single-Threaded environments due to performance considerations.

Resizing Mechanism: When the current capacity of the vector is exceeded,it doubles its size by default
(or increase by a specific capacity increment if provided)

Random Access: Similar to arrays and ArrayList,Vector allows random access to elements,making it
efficient for accessing elements using an index

Constructors Of vector

Vector(): Creates a vector with initial capacity of 10

Vector(int initialCapacity): Creates a vector with a specified initial capacity

Vector(int initialCapacity,int capacity increment); Creates a vector with initial capacity and capacity
increment(how much the vector should grow when its capacity is exceeded)

Vector(Collection<? extends E> c): Creates a vector containing the elements of the specified collection

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorLearn {

    public static void main(String[] args) {

//        Vector<Integer> vector=new Vector<>();
//        System.out.println(vector.capacity()); //10
        Vector<Integer> vector=new Vector<>(2,1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(2);
        System.out.println(vector.capacity());

        vector.add(3);

        System.out.println(vector.capacity()); // incremented by 1 capacity

        vector.add(4);

        System.out.println(vector.capacity()); // Again increment by 1capacity


        ArrayList<Integer> arrayList=new ArrayList<>(List.of(1,2,3,4,5));

        Vector<Integer> v1=new Vector<>(arrayList);

        System.out.println(v1);

        System.out.println(v1.get(0));

        System.out.println(v1.remove(Integer.valueOf(3)));

        System.out.println(v1.remove(1));

        v1.add(1,9);

        v1.set(2,10);
        System.out.println(v1);

        v1.clear(); //clear methdd present in linkedList and ArrayLista s well

        System.out.println(v1);




    }
}
