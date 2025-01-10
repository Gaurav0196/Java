package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {

    public static void main(String[] args) {
        HashMap<Person,String> map=new HashMap<>();



        Person p1=new Person("Alice",1);
        Person p2=new Person("Bob",2);
        Person p3=new Person("Alice",1);

        map.put(p1,"Engineer"); // hashcode --> Index
        map.put(p2,"Designer"); // hashcode --> Index
        map.put(p3,"Manager"); // Hashcode --> Index

        // Since Student class  extend object class has equals and hasCode method
        // We are creating object using new object both p1 and p3 will have different hashcode
        //and since no hashcode method is defined in student class hence p1 and p3 will get different bucket

        HashMap<String,Integer> map1=new HashMap<>();

        map1.put("Shubham",90); // hashcode1->index1
        map1.put("Gaurav",90); // hashcode2->index2
        map1.put("Shubham",90); //hashcode1--> Index1 _-.equlsMethod-->replace

        // here hashcode 1sta nd 3rd element will be same as String class has defined hashcode method

        //and 3rd value will replace first and equals method will work here as this is within same bucket

     //   System.out.println(map);
        // {Collection.Map.HashMap.Person@3feba861=Manager, Collection.Map.HashMap.Person@6acbcfc0=Engineer, Collection.Map.HashMap.Person@5f184fc6=Designer}
       // System.out.println(map1); //{Gaurav=90, Shubham=90}

//        System.out.println("HasMap Size: "+map.size()); //HasMap Size: 3
//        System.out.println("Value for p1: "+map.get(p1)); // Value for p1: Engineer
//        System.out.println("Value for p3:  "+map.get(p3)); // Valuefor p3:  Manager

        // Now Defining has hasCode and equals method in Students class by overriding hasCode() and equals() method from object
        //class

        System.out.println("HasMap Size: "+map.size()); //HasMap Size: 2
        System.out.println("Value for p1: "+map.get(p1)); // Value for p1: Manger
        System.out.println("Value for p3:  "+map.get(p3)); // Valuefor p3:  Manager








    }
}


class Person{
    private String name;

    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj==null){
            return false;
        }

        if(getClass()!=obj.getClass()){
            return false;
        }

        Person other=(Person) obj;
        return id==other.getId() &&  Objects.equals(name,other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
