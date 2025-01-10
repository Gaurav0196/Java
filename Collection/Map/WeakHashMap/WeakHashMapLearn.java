package Collection.Map.WeakHashMap;

import java.util.WeakHashMap;

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class WeakHashMapLearn {
    public static void main(String[] args) {

        WeakHashMap<String,Image> imagecache=new WeakHashMap<>();

        String str1=new String("img1");
        String str2=new String("img2");

        imagecache.put(str1,new Image("Image 1"));
        imagecache.put(str2,new Image("Image 2"));

        System.out.println(imagecache);
        str1=null;
        str2=null;


        System.gc(); // suggesting JVM to garbage collect
        simulateApplicationRunning();

        // String literals in String Pool are strong reference throughout the lifecycle of program
        // hence it is key reference is not getting removed. As in WeakHashMap will automatically removed
        //when its keys are no longer in use

        // So key should be non-literal keys like String str1=new String("img1") not like String str1="img1";



        System.out.println("Cache after running (some entries may be cleared)"+ imagecache);

    }

    private static void simulateApplicationRunning() {
        System.out.println("Simulate application running...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
