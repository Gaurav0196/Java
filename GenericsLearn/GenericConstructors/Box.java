package GenericsLearn.GenericConstructors;



// Making Box generic type
public class Box<T extends Number> { // Bounded Type Parameter
    private T value;

    //Creating Generic Constructor in generic class
    public Box(T value){
        this.value=value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
