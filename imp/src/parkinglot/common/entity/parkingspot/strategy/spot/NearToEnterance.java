package parkinglot.common.entity.parkingspot.strategy.spot;

import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.parkingspot.TwoWheelerSpot;

public class NearToEnterance extends ParkingStrategy{
    public ParkingSpot find() {
        return new TwoWheelerSpot();
    }
}
