package encapsulation;

public class Student {

    //Instance Variable/field name attached to the property of class

    String name;


//    int rollNumber;
//
//    int age;
//

    private int age;

    private int rollnumber;  // Class Private


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
        return age;
    }

//
//    public static void main(String[] args){
//        String name;  //Local Variable(within method)
//
//    }
//
}
