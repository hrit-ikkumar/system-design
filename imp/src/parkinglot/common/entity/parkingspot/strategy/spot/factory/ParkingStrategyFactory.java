package parkinglot.common.entity.parkingspot.strategy.spot.factory;

import parkinglot.common.constants.ParkingStrategyType;
import parkinglot.common.constants.VehicleType;
import parkinglot.common.entity.parkingspot.strategy.spot.NearToEnterance;
import parkinglot.common.entity.parkingspot.strategy.spot.ParkingStrategy;

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
