package Wrapper;

public class Test {
    public static void main(String[] args){
        int a=130; //stored in stack

        Integer b=130; //stored in heap as this is object

        Integer c=Integer.valueOf(a); //Unnecessary Boxing as Integer c=1 also works
        int d=c.intValue(); //unnecessary Unboxing as int d=c also works;

        boolean hasGraphicscard=true;

        Boolean isAdult=true;


        Integer x=null; //it can hold null sine it is null

        System.out.println(Integer.max(1,2));

        String str="123";
        Integer i=Integer.valueOf(str);

        Integer a1=128;

        Integer a2=128;

        System.out.println(i);

        System.out.println();

        System.out.println(a1==a2); //return true due to Integer caching upto -128 to 127

        System.out.println(b==c); //returns false
    }
}
