package Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();


        studentList.add(new Student("Alice", 5.2));
        studentList.add(new Student("Alex", 4.2));
        studentList.add(new Student("Bob", 4.2));
        studentList.add(new Student("Joesph", 5.9));

        // studentList.sort(null); // error as Student class doesn't have idea about natural ordering
        // as no natural defined in Student class > So we can't use Natural ordering hence need to give custom ordering
        // studentList.sort((a,b)-> (int) (a.getGpa()-b.getGpa()));

        // This ill not give correct result in our case as it got casted to int value which will
        // give incorrect result


//
//        Collections.sort(studentList,(a, b) -> {
//            if (a.getGpa() - b.getGpa() > 0) {
//
//                return -1;
//
//            } else  if (a.getGpa() - b.getGpa() < 0)
//            {
//                return 1;
//            } else {
//                // secondary sorting
//
//                return a.getName().compareTo(b.getName());
//                // if a comes first in dictionary the this will return negative and positive if a comes later
//            }
//
//        });

        studentList.sort((a, b) -> {
            if (a.getGpa() - b.getGpa() > 0) {

                return -1;

            } else  if (a.getGpa() - b.getGpa() < 0)
                {
                    return 1;
                } else {
                    // secondary sorting

                return a.getName().compareTo(b.getName());
                // if a comes first in dictionary the this will return negative and positive if a comes later
                }

            }
        );

        for(Student s:studentList){
            System.out.println(s.getName() + " "+s.getGpa());
        }


    }



    }

