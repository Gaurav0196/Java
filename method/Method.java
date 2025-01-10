package method;

public class Method {

    public static  String upperCase(String str){
        return str.toUpperCase(); // String is Immutable
    }


    public static int sum(int... a){ // Using varags
        int s=0;
        for(int i:a){
            s+=i;
        }

        return s;
    }
    public static void main(String[] args){

        String s="gaurav";
        System.out.println(upperCase(s)); //Here reference of String is passed but it is immutable ,hence not changed


        System.out.println(s);

        int[] a={1,2,3,4,5};
        System.out.println(sum(a));

    }

}
