package bitwise;

import static java.lang.System.*;

class oddEven {
    public static boolean isOdd(int num){
        return (num & 1) == 1;
    }

    public static void main(String[] args){

        out.println(5+'a'+"hello"+'a');

        out.println(isOdd(723));
    }
}
