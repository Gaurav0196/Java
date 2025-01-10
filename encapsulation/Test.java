package encapsulation;

public class Test
{
    public static void main(String[] args){
        Student student=new Student();

//        student.name="Gaurav";
//
//        student.rollNumber=17;
//
//        student.age=20;

        //We are able to set student value directly here ,Encapsulation
        // is having boundation/restriction to directly set student objects here
        // they can be set or get using method s only

        student.name="Gaurav";
        student.setAge(15);

        System.out.println(student.getAge());



    }
}
