package Final.vehicles;

import java.util.ArrayList;
import java.util.List;

public final class Car extends Vehicles {

    private final int speedLimit = 300; // once field is declared final no setters will be created

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    public final void airBags() {
        System.out.println("4 Air Bags");
    }

}


