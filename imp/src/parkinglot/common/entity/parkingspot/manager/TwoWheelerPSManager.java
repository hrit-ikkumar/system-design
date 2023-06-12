package parkinglot.common.entity.parkingspot.manager;

import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.parkingspot.strategy.spot.NearToEnterance;
import parkinglot.common.entity.parkingspot.strategy.spot.ParkingStrategy;

import java.util.List;

public class TwoWheelerPSManager extends ParkingSpotManager{
    private ParkingStrategy parkingStrategy = new NearToEnterance();
    public TwoWheelerPSManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }

    @Override
    public ParkingSpot findParkingSpot() {
        return parkingStrategy.find();
    }

}
