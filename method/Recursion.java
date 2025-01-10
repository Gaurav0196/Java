package method;

public class Recursion {

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1); //5!=5*4!;
    }

    public static int sumofNaturalNumbers(int num){

        if(num==0){
            return 0;
        }

        return num+sumofNaturalNumbers(num-1);
    }
    public static void main(String[] args){

        int n=5;
        System.out.println(factorial(5));
        System.out.println(sumofNaturalNumbers(2));
    }
}
