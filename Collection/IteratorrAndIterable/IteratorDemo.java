package Collection.IteratorrAndIterable;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int i:list){
//
//        }
//
//        //Internally this happens in for each loop as shown below
//
//        Iterator<Integer> iterator= list.listIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
//
//        for(Integer i:integers){
//            if(i%2==0){
//                integers.remove(i); // This will throw concurrent modification exception with For array  List
//                // Of Course we can use CopyOnwrite arralylist to fix this.But iterator provides this remove option
//            }
//        }
//         Using iterator to avoid concurrent exception for remove

        Iterator<Integer> itr=integers.iterator();
        while (itr.hasNext()){
            Integer number=itr.next();
            if(number%2==0){
                itr.remove();

            }
        }

        System.out.println(integers); //No concurrent modification exception

        //ListIterator

        ListIterator<Integer> listIterator=integers.listIterator();
        while(listIterator.hasNext()){
            Integer number=listIterator.next();
            if(number==3){
               // integers.add(7); // concurrent modification exception
                // only remove on iterator allowed
                 listIterator.add(7); // Works well with listIterator
            }



        }
        listIterator.add(6);
        System.out.println(integers);




    }
}
