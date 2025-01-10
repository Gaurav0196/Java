package innerClass.staticNestedInnerClass;

public class Test{

    public static void main(String[] args){
        Computer computer=new Computer("HP","ABC","XYZ");
        computer.getoS().displayInfo();

        Computer.USB usb=new Computer.USB("Type-C");// Used for performance and memory management and grouping property/object

    }
}
