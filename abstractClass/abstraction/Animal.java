package abstractClass.abstraction;

public abstract class Animal {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     protected Animal(){
        // Abstract classes should not have public constructors .As it will be called only in child clasees
        //Hence public modifier not required
    }

   protected abstract void sayHello(); // if any method marked as abstract then class must be marked as abstract
   // protected-> access within same package + can be overridden by subclass

  // Default,Public ,Protected access modifiers are allowed but not private for abstract method

    // Abstract class cna have concrete(method with body) also. Also abstract class can have concrete methods only
    //i.e. no abstract method

    public void sleep(){
        System.out.println("zzzz...");
    }
}
