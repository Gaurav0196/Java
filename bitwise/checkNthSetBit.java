package bitwise;
import static java.lang.System.*;


public class checkNthSetBit {
    public static boolean checkSetBit(int n, int bitno){
        return ((n>>bitno-1)&1)==1;
    }

    public static void main(String[] args){
        out.println(checkSetBit(21,5));
    }
}
