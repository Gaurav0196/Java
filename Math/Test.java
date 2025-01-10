package Math;

public class Test {
    public static void main(String[] args){
        // Max and Min of two integer

        int a=10;
        int b=11;
      int max=  Math.max(a,b);
      int min=Math.min(a,b);


        // Absolute value
        int c=-5;
        int abs=Math.abs(c);

        // Ceiling and floor

        double d=1.52;

        double ceil=Math.ceil(d);

        double floor=Math.floor(d);

        System.out.println(ceil);
        System.out.println(floor);

        int sq=144;
        System.out.println(Math.sqrt(sq));

        System.out.println(Math.pow(12,2));

        System.out.println((int)(Math.random()*10));


    }
}
