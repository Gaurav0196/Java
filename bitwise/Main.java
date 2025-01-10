package bitwise;


import static java.lang.System.*;

public class Main {
    public static void main(String[] args){







        // operands--> byte short int long

        // and operator &
        //or operator |
        // xor ^
        //not ~
        //left shift <<
        //right shift >>
        // unassigned right shift >>>


        int b= 4 & 5;
        out.println(STR."\{Integer.toBinaryString(4)}      \{Integer.toBinaryString(5)}");
        out.println(STR."And Operation:  \{b} Binary is : \{Integer.toBinaryString(b)}");

        int x= 4 | 5;
        out.println(STR."\{Integer.toBinaryString(4)}      \{Integer.toBinaryString(5)}");
        out.println(STR."OR Operation:  \{x} Binary is : \{Integer.toBinaryString(x)}");

        int e= 4^5; // (0,0)->0,(1,1)->0 rest 1
        out.println(STR."\{Integer.toBinaryString(4)}      \{Integer.toBinaryString(5)}");
        out.println(STR."XOR Operation:  \{e} Binary is : \{Integer.toBinaryString(e)}");

        int n= ~4;
        out.println(Integer.toBinaryString(4));
        out.println(STR."Not Operation:  \{e} Binary is : \{Integer.toBinaryString(n)}");


        int l= 4;
        out.println(Integer.toBinaryString(l));

        int left= l<<1; //Shifting binary of 4 to left 1 time(zeo at last)
                        // left means multiply by 2

        out.println(STR."Left Shift Operation:  \{left}  Binary is: \{Integer.toBinaryString(left
        )}");



        int right= l>>1; // shifting binary of 4 to right by 1 time(zero at initial)
                         // Right shift divide by 2

        out.println(STR."Right Shift operation: \{right}   Binary is \{Integer.toBinaryString(right)}");

        int u=-4;
        out.println(Integer.toBinaryString(l));
        int urs= u>>>1; // Doesn't convert initial zero after right shift to 1 instead keep it zero
        out.println(STR."Unsigned Right Shift operation \{urs}  Binary is \{Integer.toBinaryString(urs)}");


    }
}
