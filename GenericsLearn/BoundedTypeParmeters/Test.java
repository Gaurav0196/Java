package GenericsLearn.BoundedTypeParmeters;



interface printable{
    void print();
}

class MyNumber extends Number implements printable{

    private final int value;

    MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print(){
        System.out.println("myNumber: "+value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Boxx<T extends Number & printable>{ // T extends Number and implement printable interface
    // No use of implements keyword ,only extends keyword to be used for interfaces as well

    private T item;
    public Boxx(T item){
        this.item=item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }

}

public class Test {
    public static void main(String[] args) {
        MyNumber myNumber=new MyNumber(12);
        Boxx<MyNumber> box=new Boxx<>(myNumber);
        box.display();


    }
}
