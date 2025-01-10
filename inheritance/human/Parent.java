package inheritance.human;


// Multilevel inheritance  g.P->p->c
public class Parent extends Grandparent{

    public Parent(String name,int age){
        super(name,age);

        System.out.println("Parent Constructor called");
    }

    public void parentMethod(){
        System.out.println("Parent Method called!");
    }
}
