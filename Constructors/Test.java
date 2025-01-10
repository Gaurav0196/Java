package Constructors;



public class Test {
    public static void main(String[] args){
//        Student student=new Student(); // Default Constructor initialize filed with default value  i.e. sting as null
//                                       // int as 0;
//        Sine we have parameterized constructor called ,it throw error when we define default  constructor

//        System.out.println(student.getAge()); // 0
//
//        System.out.println(student.name); // null

            Student student=new Student("Gaurav",17,20);

        System.out.println(student.name);
        System.out.println(student.getAge());
        System.out.println(student.getRollnumber());


        Student s1=new Student("Vaibhav");
        System.out.println(s1.name);


    }
}
