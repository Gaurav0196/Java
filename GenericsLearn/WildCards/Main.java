package GenericsLearn.WildCards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Bound Type parameter with Wil card

    public static void main(String[] args) {

        System.out.println(sum(Arrays.asList(1,2,3,4,5)));

        List<? extends Number> list = new ArrayList<Integer>();
        //list.add(1.5); // Compilation error


        List<? super Integer> list1 = new ArrayList<Number>();
        list1.add(10); // This is allowed





    }

//    public static  int sum(ArrayList<?> numbers){
//        int sum=0;
//
//        for(Object o:numbers){
//            sum +=(int) o; // Again type safety concern
//        }
//        return sum;
//    }

    //Better way to dela with this
    // Upper Bound --> As we can't send superclass of Number here but use subclasses of number

    /*
    When you declare a list as List<? extends Number>, it means:

    The list can hold objects of some specific type that is either Number or a subtype of
    Number (like Integer, Double, Float, etc.).
    The exact type is unknown at runtime.


     */
    public static  double sum(List<? extends Number> numbers){
        double sum=0;

        for(Number o:numbers){
            sum += o.doubleValue(); // Again type safety concern
        }
        return sum;
    }

    // Another way to do this


    // Lower Bound
    // We can use superclass of Integer like Number ,Object but can't use subclass of Integer

    /*
    When you declare a list as List<? super Integer>, it means:

    The list can hold objects of some specific type that is either Integer or a supertype of
    Integer (like Number or Object).
    The lower bound guarantees that you can safely add an Integer to the list because
    Integer is always compatible with its supertypes.
     */


    public static void printNumbers(List<? super Integer> list){
        for (Object obj:list){
            System.out.println(obj);
        }
    }


}
