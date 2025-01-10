package Collection.Comparator;

// Comparator is a functional interface enabling custom ordering

// compareTo method compares two object of same type

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class MyComparator implements Comparator<Integer>{
//
////    @Override
////    public int compare(Integer o1, Integer o2) {
////        return o1-o2; // Ascending and return o2-o1 descending , here we are provid custom logic
////    }
////
////    // int<0 means o1  will come first the o2
////    // int>0 means o2 will come first then o1
////    // int=0 both are equal
////
////    // 5 3
////    //3 5 take thia as a reference
////}

public class ComparatorLearn {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Guava", "Apple", "Watermelon", "Banana"));

        fruits.sort(null);

        System.out.println(fruits);


        List<Integer> numbers = new ArrayList<>(List.of(32,45,12,65,33,44,23));

//        Comparator<Integer> comparator=(a,b)->{
//            return a-b; // ascending similarly b-a descending
//
//        };
//
//        Comparator<String> comparator1=(a,b)->{
//
//            // consider o1 and o2 as "ok" ,"bye" .we will be sorting based on strig length
//
//            return b.length()-a.length();// Descending
//
//
//        };

        numbers.sort((a,b)-> a-b);
        fruits.sort((a,b)->b.length()-a.length());
        System.out.println(numbers);
        System.out.println(fruits);




    }
}
