package bitwise;

import static java.lang.System.*;



public class checkPoweroftwo {

    public static boolean checkTwoToThePower(int n){
        if (n==0){
            return false;
        }

        else {
            return (n & (n - 1)) ==0;
        }
    }

    public static void main(String[] args){
        out.println(checkTwoToThePower(1280));
    }
}
