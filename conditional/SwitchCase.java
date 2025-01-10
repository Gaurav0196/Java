package conditional;

import static java.lang.System.out;

public class SwitchCase {
    public static void main(String[] args){
        // Switch can be used with following data types:
        //int,char,String,byte,short,enum types but not with float,double
        // from java7 String can be used with switch case
        int day=8;

        switch (day){
            case 1:{
                out.println("Monday");
                break;
            }

            case 2:{
                out.println("Tuesday");
                break;
            }
            case 3:{
                out.println("Wednesday");
                break;
            }

            case 4:{
                out.println("Thursday");
                break;
            }

            case 5:{
                out.println("Friday");
                break;
            }

            case 6:{
                out.println("Saturday");
                break;
            }

            case 7:{
                out.println("Sunday");
                break;
            }
            default:{
                out.println("Invalid day");
            }
        }
    }
}
