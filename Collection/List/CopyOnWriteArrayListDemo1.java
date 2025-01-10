package Collection.List;

// Used for Concurrent Modification

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo1 {
    public static void main(String[] args) {

        //List<String> sharedList=new ArrayList<>();
        List<String> sharedList=new CopyOnWriteArrayList<>();
        sharedList.add("item1");
        sharedList.add("item2");
        sharedList.add("item3");

        Thread readerThread=new Thread(()->{
            try {
                while(true){
                    for (String item:sharedList){
                        System.out.println("Reading item: "+item);
                        Thread.sleep(100);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Exception in reader Thread: "+e);
            }

        });

        Thread writerThread=new Thread(()->{
            try {
                Thread.sleep(500);
                sharedList.add("item4");
                System.out.println("Added item4 to the list");
                Thread.sleep(500);
                sharedList.remove("item1");
                System.out.println("Removed item1 from the list");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        readerThread.start();
        writerThread.start();
// With ArrarList exception thrown as reader thread is iterating over arraylist then writerThread tried modifying the list

        //With CopyonWrite arraylist it works fine

    }
}
