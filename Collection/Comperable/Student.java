package Collection.Comperable;

public class Student implements Comparable<Student> {
    private String name;

    private double gpa;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }


    // 4 3 _> 4.compareto(3)
    @Override
    public int compareTo(Student o) {

        //return Double.compare(this.getGpa(),o.getGpa()); // Ascending

        return Double.compare(o.getGpa(),this.getGpa());
     // return this.getName().length()-o.getName().length(); //Ascending  consider this as o1
    }
}
