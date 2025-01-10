package inheritance.human;

public class Grandparent {


    private String name;  //Here property will be inherited like String variable name not the value of property

    private int age;



    private boolean hasSuperPower;


    public Grandparent(String name ,int age){

        this.age=age;
        this.name=name;
        hasSuperPower=false;
        System.out.println("GrandParent Constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasSuperPower() {
        return hasSuperPower;
    }
}
