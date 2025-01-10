package inheritance;

import inheritance.animals.Animal;
import inheritance.animals.Cat;
import inheritance.animals.Dog;
import inheritance.human.Child;
import inheritance.human.Parent;

public class Main {

    public static void main(String[] args) {
//        Dog dog=new Dog();
//        Cat cat=new Cat();
//        cat.setAge(2);
//        cat.sayHello();
//        dog.setAge(2);
//        dog.setName("Tom");
//
//        dog.eat();
//
//        dog.sayHello();
//
//
//        //MultiLevel Inheritance
//
//        Child child=new Child();
//        child.setAge(10);
//        child.setName("Ram");
//
//
//        Parent parent=new Parent();
//
//        parent.setAge(30);
//        parent.setName("RamPrakash");

//        Child child = new Child(); //Constructor of GrandParent called while creating child object
//        System.out.println(child.hasSuperPower());
//        child.childMethod(); // Output->Parent Constructor called
//                             //   Child constructor called

        // GrandParent Constructor called
        //Parent Constructor called
        //Child constructor called      --> Order of execution .

        // this --refers to current instance .For example -if we are setting of child
        // object but setNAme is present in GP Class so it will not set the name of Grandparent
        // but of instance only where it is called  i.e child object

        // super--> denotes parent class i.e class parent class constructor automatically
        //call to super must be first statement in constructor body
        // This is doesn't applicable in case of methods using super (first statement thing)

        // super prefer to immediate parent

        //super can parameterize constructor of parent class

        //Parameterized constructor with super



        Child child = new Child("Gaurav",20);

        System.out.println(child.getAge());
        child.childMethod();




        Animal dog=new Dog();

        dog.sayHello(); //upcasting(Parent reference to call child's object)

        Dog d= (Dog) dog; //downcasting

      //  dog.sayBye(); //Throws error with parent class reference only those method will be called which are defined in parent class
                      // since sayBye is not defined in parent class Animal error si thrown























    }
}
