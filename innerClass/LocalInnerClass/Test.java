package innerClass.LocalInnerClass;

public class Test {

    public static void main(String[] args){
        Hotel hotel=new Hotel("Sunshine",10,5);
        hotel.reservedRoom("Gaurav",5);
        hotel.reservedRoom("Vaibhav",1);
        hotel.reservedRoom("Shubham",-1);
    }
}
