package Collection.List;

// Stack extend Vector Class ,it is synchronized ,making thread-safe
// LIFO(Last In First Out) principle

/*
LIFO Structure: Stack follows the Last-In-First-Out(LIFO) principle,where the last element added is the first one to be
removed.

Inheritance: Stack is a subclass of Vector ,which means it inherits all the features of dynamic array but is constrained
by Stack's LIFO nature


 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackLearn {

    public static void main(String[] args) {
        Stack<Integer>  stack=new Stack<>();

        stack.push(1); // Adding element to Stack
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);

        Integer pop = stack.pop();// Last element pushed will be removed

        System.out.println(pop);
        System.out.println(stack);

        Integer peek = stack.peek();// To get the top element of stack
        System.out.println(peek);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(3);// get the index of element from top and here 1 based indexing applies
        System.out.println(search);

// Since it extends Vector ,all vector methods are applicable here like remove(0,removeAll,add(),clear()


        // Using LinkedList as Stack


        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        System.out.println(linkedList.getLast()); // Equivalent to Peek
        linkedList.removeLast(); // Equivalent to pop

        System.out.println(linkedList);

        // ArrayList as Stack

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.get(arrayList.size()-1); // peek of stack
        arrayList.remove(arrayList.size()-1); //pop





    }
}
