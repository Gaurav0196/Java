package AccessModifiers.zoo;

public class Animal {
    private String name;

    protected String sound;

    public Animal(String name,String sound){
        this.name=name;
        this.sound=sound;
        System.out.println("Parent Constructor Called");
    }

    public void makeSound(){
        System.out.println(name +" makes sound "+sound);
    }

    protected void changeSound(String newSound){
        this.sound=newSound;
    }
}
