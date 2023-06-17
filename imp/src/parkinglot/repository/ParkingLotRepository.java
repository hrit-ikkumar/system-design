package parkinglot.repository;

import parkinglot.dao.constants.VehicleType;
import parkinglot.dao.entity.parkingspot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRepository {
    private List<ParkingSpot> parkingSpotList;

    public void addParkingLot(ParkingSpot parkingSpot) {
        if(parkingSpotList == null) {
            parkingSpotList = new ArrayList<>();
        }
        parkingSpotList.add(parkingSpot);
    }

    public List<ParkingSpot> getParkingLots() {
        return parkingSpotList;
    }

    public List<ParkingSpot> getParkingSpotListByVehicleType(VehicleType vehicleType) {
        List<ParkingSpot> result = new ArrayList<>();

        parkingSpotList.forEach(parkingSpot -> {
            if(parkingSpot.vehicle().getVehicleType() == vehicleType) {
                result.add(parkingSpot);
            }
        });

        return result;
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.remove(parkingSpot);
    }
}
