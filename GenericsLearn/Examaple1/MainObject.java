package GenericsLearn.Examaple1;

public class MainObject {
    public static void main(String[] args) {
//        Box box=new Box();
//
//        box.setValue(1);
//
//        int i= (int) box.getValue();
//
//        String s= (String) box.getValue();// Class cast exception
//
//        System.out.println(i);

        // Solution is use to make Box type Generic

        //Generic types allow you to define a class,interface,or method with placeholders(type parameters)
        // for the data type they will work with

        Box<Integer> box=new Box<>(); // Box is now type safe

        box.setValue(1);
        // String s= (String) box.getValue(); // Now e will get compile type error

        int i=box.getValue();

        System.out.println(i);



    }
}
