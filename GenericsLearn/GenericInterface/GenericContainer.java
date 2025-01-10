package GenericsLearn.GenericInterface;
//
//public class GenericContainer implements Container<T>{
//
//    private T item; // erro0 cannot resolve symbol T
//    @Override
//    public void add(T item) {
//        this.item=item;
//
//    }
//
//    @Override
//    public T get() {
//        return item;
//    }
//}

public class GenericContainer<T> implements Container<T>{

    private T item; // error cannot resolve symbol T
    @Override
    public void add(T item) {
        this.item=item;

    }

    @Override
    public T get() {
        return item;
    }
}
