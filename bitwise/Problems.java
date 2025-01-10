package bitwise;
import static java.lang.System.*;

public class Problems {

    public static String decimalToBinary(int n){
        StringBuilder bin= new StringBuilder();
        int rem=0;


        if(n==0){
            return "0";
        }

        while(n>0) {
           rem=n%2;

           bin.append(String.valueOf(rem));
           n=n/2;

        }
        return bin.reverse().toString();

    }


    public static Integer binarytoDecimal(String bin){

        int res=0;

        int m=1;
        for(int i= bin.length()-1;i>=0;i--){

            String lastChar= String.valueOf(bin.charAt(i));

            int lastbit= Integer.parseInt(lastChar);

            res=res+m*lastbit;
            m=m*2;



        }

        return res;
    }

    public static void main(String[] args){

        out.println(STR."\{decimalToBinary(45)}");

        out.println(STR."\{binarytoDecimal("101101")}");

        // MSB(Most Significant Bit) and LSB(Least Significant Bit0
        // Example in 10000  0 is LSB and 1 is MSB

        // SetBit--> Set bIt are those bit which are for ex-> 101 1sta nd last bit are SB here

        // For ODD number LSB is 1. So to check odd number;
        // and(&) with the given number,if result==1(LSB of 1 is 1) then odd










    }
}
