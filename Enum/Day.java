package Enum;

public  enum Day {

    //private String lower; // Error first enum constant should be define then fileds

    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");// List od days are final instance of day class

    // public static final class Day extends java.lang.Enum<Days>{
    //public static final Day MONDAY=new DAY("MONDAY",0) --> first arg-->name ,2nd arg-->ordinal value

    // constructor -> private Day(String name,int ordinal){ super(name,ordinal);}

    //Method can be defined inside enum


    private String lower; // Field can be defined

    private Day(String lower){
        System.out.println("Custom constructor called"); //will be called 7 times while creating day isntances
        //Creating custom constructor
        this.lower=lower;
    }

    public String getLower() {
        return lower;
    }

    public void display(){
        System.out.println("Today is "+ this.name());
    }


}
