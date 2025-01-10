package GenericsLearn.WildCards;

// Wildcards(?) are a special kind of type argument that can be used in method arguments
// or class definitions to represent an unknown type. They allow for more flexible and dynamic code by
// letting the type be specified later or be more loosely defined

/*
Wildcards provide flexibility, especially when you want to write code that can work with different types,
but you don’t want to be too specific about the types. They are often used when you want a method to
accept arguments of generic types without tying it down to a particular class.

For instance, if you need to write a method that can handle a list of any object type (e.g., List of Integer,
List of String, etc.), wildcards allow you to do that.
 */

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // for read only work wildcard is helpful

        // Using wilcard pattern we can't add data to let say ArrayList



    }

    public void printList(List<?> list) {

        // here wildcard can be used as we are reading te data and void return type
        for (Object element : list) {
            System.out.println(element);
        }
    }


//    public Object getFirst(ArrayList<?> list){
//       return list.get(0); // Here Wildcard is not recommended due to type safety concern
//    }
//
    //Fix of above method
    public<T> T getFirst(ArrayList<T> list){
        return list.get(0); // Here Wildcard is not recommended due to type safety concern
    }

    public <T> void copy(ArrayList<T> source,ArrayList<T> destination){

        // Not use to Wildcard pattern here as Type safet will be violated while adding
        //element to other list


        for(T item:source){
            destination.add(item);
        }
    }
}
