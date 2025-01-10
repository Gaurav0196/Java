package AccessModifiers;

import AccessModifiers.zoo.Dog;

public class Main {

    public static void main(String[] args){
        Dog dog=new Dog("Bob");
        dog.makeSound();
       // dog.changeSound(); //Not accessible as it is marked as protected and Main class is not extending animal

        dog.setSound("woof");

        dog.makeSound();

        dog.wagTail();
    }
}
