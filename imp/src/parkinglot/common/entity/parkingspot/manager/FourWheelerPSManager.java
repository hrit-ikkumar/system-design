package parkinglot.common.entity.parkingspot.manager;

import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.parkingspot.strategy.spot.NearToEnterance;
import parkinglot.common.entity.parkingspot.strategy.spot.ParkingStrategy;
import parkinglot.common.entity.parkingspot.strategy.spot.factory.ParkingStrategyFactory;

import java.util.List;

public class FourWheelerPSManager extends ParkingSpotManager{
    private final ParkingStrategy parkingStrategy = new NearToEnterance();
    public FourWheelerPSManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }

    @Override
    public ParkingSpot findParkingSpot() {
        return parkingStrategy.find();
    }
}
