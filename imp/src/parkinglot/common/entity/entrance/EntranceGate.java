package parkinglot.common.entity.entrance;

import parkinglot.common.constants.VehicleType;
import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.parkingspot.manager.ParkingSpotManager;
import parkinglot.common.entity.parkingspot.manager.factory.ParkingManagerFactory;

public class EntranceGate {
    private ParkingManagerFactory parkingManagerFactory;
    private ParkingSpotManager parkingSpotManager;

    public ParkingSpot findSpace() {
        return parkingSpotManager.findParkingSpot();
    }
}
