package innerClass.LocalInnerClass;

public class Hotel {

    private String name;

    private int totalRooms;

    private int reserved;

    public Hotel(String name, int totalRooms, int reserved) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reserved = reserved;
    }

    public void reservedRoom(String guestName,int noOfRoom){

        // Class Inside Method --> Local Inner class example


        // This class can access reserved of enclosing class
        class ReservationValidator{
            boolean validate(){
                if (guestName==null || guestName.isBlank()){
                    System.out.println("Guest name can't be empty");

                    return false;
                }

                if(noOfRoom<0){
                    System.out.println("Number of rooms should be positive");

                    return false;
                }

                if(reserved+noOfRoom>totalRooms){
                    System.out.println("Not enough room availaible");

                    return false;
                }

                return true;
            }



        }

        ReservationValidator validator=new ReservationValidator();

        if(validator.validate()){
            reserved+=noOfRoom;

            System.out.println("Reservation confirmed for "+ guestName+" for "+noOfRoom);
        }else {
            System.out.println("Reservation failed for "+ guestName+" for "+noOfRoom);
        }

    }
}
