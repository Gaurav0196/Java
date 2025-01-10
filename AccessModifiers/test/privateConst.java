package AccessModifiers.test;

public class privateConst {
    // To create only one object of a class
    // create private constructor--> Hence no object creation(Singleton pattern)

    private static privateConst instance;

    private privateConst(){

    }

    public static privateConst getInstance(){
        if (instance==null){
            instance=new privateConst();// constructor can be accessed as it is within same class
        }

        return instance;
    }
}
