package Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVsVector {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list=new ArrayList<>();
        Vector<Integer> vector=new Vector<>();

        Thread t1=new Thread(()->{

            for(int i=0;i<100;i++){
                list.add(i);
                vector.add(i);
            }

        });

        Thread t2=new Thread(()->{

            for(int i=0;i<100;i++){
                list.add(i);
                vector.add(i);
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(list.size());
        System.out.println(vector.size());

        // Since Arraylist is non-synchronized we didn't get correct count

        // vector is synchronized hence w e can get correct size i.e. 200
    }
}
