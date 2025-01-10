package Collection.Map.WeakHashMap;


import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

class Phone{
    private String name;

    private String Model;

    public Phone(String name, String model) {
        this.name = name;
        Model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}

public class GC {

    public static void main(String[] args) throws InterruptedException {
        Phone phone=new Phone("apple","16 pro max");
        // phone is called as strong reference here
        System.out.println(phone);

        phone=null;
        System.out.println(phone);

        //Now phone doesn't point to any object in the heap .hence it will get Garbage collected by jVM

        //Weak Reference

        WeakReference<Phone> weakReference= new WeakReference<>(new Phone("Samsung","Galaxy j7"));


        // A WeakReference in java is aa reference type that allows an object to be garbage-collected
        /// when it is only weakly reachable ,meaning there are no strong references to it.

        System.out.println(weakReference.get());

        Thread.sleep(10000);

        // JVM can remove weak reference if it sees it not getting used anywhere

        System.gc(); //JVM now removes weak reference

        System.out.println(weakReference.get());





    }
}
