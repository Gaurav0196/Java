package interfaceJava;


// Interface blueprint of class contains abstract method and static constants
public class Test {
    public static void main(String[] args){
    Dog dog=new Dog();
    Cat cat=new Cat();
        dog.eat();
       // dog.MAX_AGE=60; // cannot assign value to static constants--> error
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        Animal.info(); // static method attached to interface

        // Dog.info();  // Error not allowed -static method must be invoked on Interface class only
       // Animal.run();// Default methods can't be called using interface Animal
        Animal animal=new Dog();
        animal.run(); //default method

        dog.run();
        cat.run();   // This is allowed(use -if we want to add a method in interface without breaking anything

        // example--> let's there 100 classes implementing interface if we define void run() then we have to provide
        // for run in 100 classes even though we don't need this in all classes.Hence default is introduced
        }

}
