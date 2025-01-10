package GenericsLearn.GenericsInENUM;

public class Test {
    public static void main(String[] args) {

        double res1=Operation.ADD.apply(10,20);
        double res2=Operation.MULTIPLY.apply(10,20);
        System.out.println(res1);
        System.out.println(res2);

    }
}
