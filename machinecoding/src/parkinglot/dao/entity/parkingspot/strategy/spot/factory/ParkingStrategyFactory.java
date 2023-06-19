package parkinglot.dao.entity.parkingspot.strategy.spot.factory;

import parkinglot.dao.constants.ParkingStrategyType;
import parkinglot.dao.entity.parkingspot.strategy.spot.NearToEnterance;
import parkinglot.dao.entity.parkingspot.strategy.spot.ParkingStrategy;

public class ParkingStrategyFactory {
    public ParkingStrategy getParkingStrategY(ParkingStrategyType parkingStrategyType) {
        switch (parkingStrategyType) {
            case NEAR_TO_ENTERANCE:
                return new NearToEnterance();
            default:
                return new NearToEnterance();
        }
    }
}
