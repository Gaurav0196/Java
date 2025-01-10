package innerClass.memberInnerClass;



public class Test {

    public static void main(String[] args){
       Car car=new Car("Safari");
       Car.Engine engine=car.new Engine();



       engine.start();
       engine.stop();

    }
}
