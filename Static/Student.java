package Static;

public class Student {

    // Static Block
    static
    {
        System.out.println("Hello");
    }

    public static int count=0;

    public Student(){
        count++;
    }

    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static void getCount(){
        System.out.println("Total Students: "+count);

        // The static method can't use non-static data member or call non-static method directly
        // this and super can't be used in static context(this amd super refers object)

        // Static objects are initialized first whether object is created or not

       // System.out.println("Total Students: "+age); //Non Static filed can't be referenced from static context .Hence error
    }
}
