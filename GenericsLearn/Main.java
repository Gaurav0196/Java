package GenericsLearn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
//        list.add("Hello");
//        list.add(123);
//        list.add(3.14);
//
//        String s= (String) list.get(0); // Here return type will be object type hence casting to String
//
//        String s1= (String) list.get(1); // This give s runtime error. There is type safety issue with this
//        // like we're inserting Int and trying to get String for that and we have to do manual cast
//

        ArrayList<String> list=new ArrayList<>();
        list.add("Hello");
    //    list.add(123); // Now it won't allow to add value apart from Strings
        list.add("Wolrd");


        /*
        Without generic :

        Type Safety
        Manual Casting
        No Compile time checking

         */

    }

}
