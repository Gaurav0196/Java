package GenericsLearn.GenericConstructors;

public class Box2 {
    // Creating Generic Constructor in non-generic class
    //Generic Type constructor
    public<T> Box2(T value){

    }

    public static void main(String[] args) {
        Box2 box2=new Box2("Hello");
        Box2 box3=new Box2(1);

        // All these works due to generic constructor

        // similarly we can have T extends number as well


    }
}
