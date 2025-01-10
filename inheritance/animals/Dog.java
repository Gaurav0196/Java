package inheritance.animals;

public class Dog extends Animal {

//    private String name;  //This is repetition of code as same property are present in
//                          // Animal class . So Dog will inherit these properties from Animal class
//
//    private int age;


    @Override
    public void sayHello() {
        System.out.println("woof");
    }  // Mmthod Overriding

    public void sayBye(){
        System.out.println("Woof Woof");
    }
}
