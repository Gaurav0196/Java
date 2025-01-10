package Collection.Sets;

import javax.xml.transform.Source;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        //Thread -Safe
        //Copy-On-Write Mechanism
        // No Duplicate Elements
        // Iterators Do not reflect modifications
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet=new CopyOnWriteArraySet<>();

        ConcurrentSkipListSet<Integer> skipListSet=new ConcurrentSkipListSet<>();

        for (int i=0;i<=5;i++){
            copyOnWriteArraySet.add(i);
            skipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: "+copyOnWriteArraySet);
        System.out.println("Initial ConcurrentSkipListSet: "+skipListSet);

        System.out.println("Iterating and modifying CopyOnWriteArraySet: ");

        for (Integer num:copyOnWriteArraySet){
            // attempting to modify set during Iteration
            System.out.println("Reading from CopyOnWriteArraySet: "+num);
            copyOnWriteArraySet.add(6); //this will not be printed before loop completes
        }

        System.out.println("Iterating and modifying ConcurrentSkipListSet: ");

        for(Integer num:skipListSet){
            //attempting to modify the set during iteration
            System.out.println("Reading from ConurrentSkipListSet: "+num);

            skipListSet.add(6); //this will be printed before loop completes
            // that's why it is called weakly consistent

            if(num==6){
                skipListSet.add(7); // here 7 will not be added hence called weakly consistent ,behaviour can't be predicted
            }




    }

        System.out.println(skipListSet); // here 7 will appear
}}
