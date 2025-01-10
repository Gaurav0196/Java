package string;

public class TestString {

    public static void main(String[] args){
        String s1="Gaurav";
        String s2="gaurav";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s2)); //0

        String  str1="remote";
        String str2="car";

        System.out.println('r'+0); // Ascii value
        System.out.println('c'+0);

        System.out.println(str1.compareTo(str2));// Difference of Ascii lexicographically.

        int x=10;

        String s=String.valueOf(10);
        System.out.println(s);


        String s3=String.format("My name is %s and i am %d years old ","Gaurav",28);
        System.out.println(s3);


        String j1="ABC";

        String j2=",";

        String j3="DEF";


        System.out.println(String.join(j2,j1,j3));




    }
}
