package parkinglot.services;

import parkinglot.dao.entity.parkingspot.ParkingSpot;
import parkinglot.dao.entity.parkingspot.strategy.spot.NearToEnterance;
import parkinglot.dao.entity.parkingspot.strategy.spot.ParkingStrategy;

import java.util.List;

public class TwoWheelerPSManager extends ParkingSpotManager{
    private ParkingStrategy parkingStrategy = new NearToEnterance();

    @Override
    public ParkingSpot findParkingSpot() {
        return parkingStrategy.find();
    }

}
