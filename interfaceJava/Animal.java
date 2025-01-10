package interfaceJava;

public interface Animal {

    int MAX_AGE=20;  //it is same public static final int max age=20

    public abstract void eat();

    void sleep();

    // with Java 8 update now static and default method with body can be written inside interface

    public static void info(){
        System.out.println("This is Animal Interface");
    }

    public default void run(){
        this.eat(); //we can use this inside default methods
        System.out.println("Animal is running");
    }


}
