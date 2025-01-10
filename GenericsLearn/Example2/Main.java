package GenericsLearn.Example2;

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> pair=new Pair<>("Age",30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

    }
}
