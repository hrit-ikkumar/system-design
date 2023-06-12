package parkinglot.common.entity.parkingspot.manager.factory;

import parkinglot.common.constants.VehicleType;
import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.parkingspot.manager.FourWheelerPSManager;
import parkinglot.common.entity.parkingspot.manager.ParkingSpotManager;
import parkinglot.common.entity.parkingspot.manager.TwoWheelerPSManager;

import java.util.ArrayList;

public class ParkingManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerPSManager(new ArrayList<ParkingSpot>());
            case FOUR_WHEELER:
                return new FourWheelerPSManager(new ArrayList<ParkingSpot>());
            default:
                return new TwoWheelerPSManager(new ArrayList<>());
        }
    }
}
