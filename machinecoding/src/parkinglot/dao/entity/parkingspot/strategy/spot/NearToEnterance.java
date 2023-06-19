package parkinglot.dao.entity.parkingspot.strategy.spot;

import parkinglot.dao.entity.parkingspot.ParkingSpot;
import parkinglot.dao.entity.parkingspot.TwoWheelerSpot;

public class NearToEnterance extends ParkingStrategy{
    public ParkingSpot find() {
        return new TwoWheelerSpot();
    }
}
