package Constructors;

public class Student {

    //Instance Variable/field name attached to the property of class

    String name;


//    int rollNumber;
//
//    int age;
//

    private int age;

    private int rollnumber;  // Class Private

    // Parameterized Constructor


    public Student(String name,int rollnumber,int age){
        this.age=age;

        this.rollnumber=rollnumber;

        this.name=name;
    }

    //Constructor overloading

    public Student(String name){
        this.name=name;

    }

    public Student(int rollnumber){
        this.rollnumber=rollnumber;
    }
    public void setAge(int age){
        if(age<0){
            age=0;
        }

        this.age=age;
    }

    public void setRollNUmber(int rollnumber){
        if(rollnumber<0){
            rollnumber=0;
        }

        this.rollnumber=rollnumber;
    }


    public int getAge(){
        return age;
    }


    public int getRollnumber(){
        return rollnumber;
    }

//
//    public static void main(String[] args){
//        String name;  //Local Variable(within method)
//
//    }
//
}
