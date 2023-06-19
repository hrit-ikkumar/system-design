package parkinglot.services.factory;

import parkinglot.dao.constants.VehicleType;
import parkinglot.dao.entity.parkingspot.ParkingSpot;
import parkinglot.services.FourWheelerPSManager;
import parkinglot.services.ParkingSpotManager;
import parkinglot.services.TwoWheelerPSManager;

import java.util.ArrayList;

public class ParkingManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerPSManager();
            case FOUR_WHEELER:
                return new FourWheelerPSManager();
            default:
                return new TwoWheelerPSManager();
        }
    }
}
