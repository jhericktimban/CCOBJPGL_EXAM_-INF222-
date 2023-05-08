package Locations;

import Tourist.Tourist;

public class Moon implements Locations {

    int airFare = 10;

    public int getAirfare() {
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

}