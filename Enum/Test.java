package Enum;

import static Enum.Day.MONDAY;


//enum is a special data type that allows you to define a set of constants.

public class Test {

    public static enum Months{
        // Nested enum types are implicitly static, so there is no need to declare them static explicitly.
    }
    public static void main(String[] args){
//        System.out.println(Day.MONDAY);
//        System.out.println(Day.TUESDAY);
//        System.out.println(Day.WEDNESDAY);
//        System.out.println(Day.THURSDAY);
//        System.out.println(Day.FRIDAY);
//        System.out.println(Day.SATURDAY);
//        System.out.println(Day.SUNDAY);

        Day day= MONDAY;

//        switch (day){
//            case MONDAY -> {
//                System.out.println("M");  //break statement is redundant not required in new switch syntax
//            }
//            case TUESDAY -> {
//                System.out.println("T");
//            }
//        }

        //switch can be used as expression
        String res=switch (day){
            case MONDAY -> "M";
            case TUESDAY -> "T";


            default -> "weekend";
        };

        int ordinal= day.ordinal();
        System.out.println(ordinal);
        System.out.println(day.name());

        Day enumDay=Day.valueOf("TUESDAY");
        System.out.println(enumDay);

        for(Day x:Day.values()){
            System.out.println(x);
        }

        day.display();
        System.out.println(day.getLower());
    }


}
