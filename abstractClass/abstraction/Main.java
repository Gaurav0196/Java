package abstractClass.abstraction;

import abstractClass.abstraction.Animal;
import abstractClass.abstraction.Cat;
import abstractClass.abstraction.Dog;

public class Main {
    public static void main(String[] args){
        Animal dog=new Dog();  //we can have reference of abstract class with object of subclass
        dog.sayHello();

        Animal d=new Cat();



     //   Animal animal=new Animal() ; // Abstract class can't be instantiated





    }
}
