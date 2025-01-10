package GenericsLearn.GenericMethods;

public class Test {

    public static void main(String[] args) {

        Integer[] intArray={1,2,3,4};
        String[] array={"hello","world"};
        display(intArray);
        display(array);
        display(4); // Overloade method
    }

    //syntax generic methods
//
//    public <T> void methodName(T parameter){
//        // method
//    }


    public static <T> void display(T[] array){
        for(T element :array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method Overloading example

    public static void display(Integer element){

        System.out.println("Integer dsiplay: "+element);

    }
}
