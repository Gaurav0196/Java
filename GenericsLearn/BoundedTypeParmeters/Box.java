package GenericsLearn.BoundedTypeParmeters;

//public class Box {
//    Object Value;
//
//    public Object getValue() {
//        return Value;
//    }
//
//    public void setValue(Object value) {
//        Value = value;
//    }
//}

// Making Box generic type
public class Box<T extends Number> { // Bounded Type Parameter
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
