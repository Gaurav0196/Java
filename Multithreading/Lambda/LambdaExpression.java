package Multithreading.Lambda;

// Lambda expression--> anonymous function

// eg-> public void fun(){s.o.p("hello"} remove public void and name .()->{s.o.p("hello)}

public class LambdaExpression {

    public static void main(String[] args) {

//        Runnable runnable=()-> {
//            System.out.println("hello");
//
//        };

       // Runnable runnable=()-> System.out.println("hello");

      //  Thread t=new Thread(runnable);

        //Thread t=new Thread(()-> System.out.println("hello"));

        Thread t=new Thread(()->
        {
        for(int i=0;i<10;i++)   {
            System.out.println(i);
        }
        });
        t.start();

    }
}
