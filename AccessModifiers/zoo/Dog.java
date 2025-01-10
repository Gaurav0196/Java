package AccessModifiers.zoo;

public class Dog extends Animal{

    public Dog(String name) {
        super(name, "Bark");
        System.out.println("Child Constructor Called");
    }

    public void wagTail(){
        System.out.println(getName()+" is wagging its tail");
    }

    private String getName(){
        return getClass().getSimpleName();
    }

    public void setSound(String newSound){
        changeSound(newSound);

    }
}
