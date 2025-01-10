package inheritance.human;

public class Child extends Parent{
    public Child(String name,int age){
        super(name,age);
        System.out.println("Child constructor called");
    }

    public void childMethod(){
        System.out.println("Child Method called!");
        super.parentMethod();
    }
}
