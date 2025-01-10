package Collection.Comperable;

/* Comparator provides custom sorting logic . While Comparable is used to provide natural sorting logic.

Natural order can be provided to class by implementing comparable interface and implementing CompareToMethod
 */



import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;

public class Comparablelearn {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();


        studentList.add(new Student("Alice", 5.2));
        studentList.add(new Student("Alex", 4.2));
        studentList.add(new Student("Bob", 4.2));
        studentList.add(new Student("Joesph", 5.9));

        //studentList.sort(null);// This throws exception as there is natural order logic defined in Student class


        // After implementing Comparable Interface in Student claas

        studentList.sort(null);

        System.out.println(studentList);



    }
}
