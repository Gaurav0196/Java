package GenericsLearn.BoundedTypeParmeters;

public class MainObject {
    public static void main(String[] args) {


//        /
        // Type parameter 'java.lang.String' is not within its bound;
        // should extend 'java.lang.Number'
       // Box<String> box=new Box<>();
        Box<Integer> box=new Box<>(); // Works fine as Integer extend Number class


        box.setValue(1);
        // String s= (String) box.getValue(); // Now e will get compile type error

        int i=box.getValue();

        System.out.println(i);



    }
}
