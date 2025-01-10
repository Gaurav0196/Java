package Collection.List;

// Used for Concurrent Modification

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> arrayList=new CopyOnWriteArrayList<>();

        // "Copy on Write" means that whenever a write operation like adding or removing element,instead
        // of directly modifying the existing list , a new copy of the list is created, and the modification
        //is applied to that copy .This ensure that other thread reading the list while it's being modified are unaffected


        // Read Operations: Fast and direct,since they happen on stable list without interference from modification

        // Write Operation: A new copy of the list is created for every modification

        //The reference to the list is then updated so that subsequent reads this new list

        //  used for read extensive stuffs because for every write new copy ie being created so memory consumption is high

       // List<String> shoppingList=new ArrayList<>();

        List<String> shoppingList=new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");


        System.out.println("Initial Shopping List: "+shoppingList);
//        for(String item:shoppingList){
//            System.out.println(item);
//            if(item.equals("Eggs")){
//                shoppingList.add("Butter");
//                System.out.println("Added Butter while reading");
//
//                // Here we get ConcurrentModification exception because arraylist gets modified while iterating the same list
//            }
//        }

        for(String item:shoppingList){
            System.out.println(item);
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading");


                // This works with copyOnWrite arraylist

                // Once loop is finished the new item will be added to our list. As it reads on snapshot of list
            }
        }
        // old=new
        System.out.println("Updated Shopping List: "+shoppingList);




    }
}
