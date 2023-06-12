package parkinglot.common.entity.parkingspot.manager;

import parkinglot.common.constants.VehicleType;
import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.parkingspot.strategy.spot.ParkingStrategy;
import parkinglot.common.entity.ticket.Ticket;
import parkinglot.common.entity.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpotManager {
    private List<ParkingSpot> parkingSpotList;


    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpotList = parkingSpots;
    }

    public abstract ParkingSpot findParkingSpot();

    public void addParkingSpot(ParkingSpot parkingSpot) {
        if(parkingSpotList == null) {
            this.parkingSpotList = new ArrayList<>();
        }
        parkingSpotList.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) throws Exception{
        if(parkingSpotList == null) {
            throw new Exception("Parking Lot doesn't have any parking spot");
        }
        parkingSpotList.remove(parkingSpot);
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) throws Exception {
        if(parkingSpotList == null) {
            throw new Exception("Parking Lot doesn't have any parking spot");
        }

        for(ParkingSpot ps: parkingSpotList) {
            if(ps.equals(parkingSpot)) {
                ps.parkVehicle(vehicle);
            }
        }
        throw new Exception("Couldn't park the vehicle");
    }

    public void removeVehicle(Ticket ticket) throws Exception{
        if(parkingSpotList == null) {
            throw new Exception("Parking Lot doesn't have any parking spot");
        }

        for(ParkingSpot ps: parkingSpotList) {
            if(ps.equals(ticket.getParkingSpot())) {
                ps.removeVehicle();
                return;
            }
        }
        throw new Exception("Couldn't remove the vehicle from parking slot");
    }
}
