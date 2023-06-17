package parkinglot.services;

import parkinglot.dao.entity.parkingspot.ParkingSpot;
import parkinglot.dao.entity.ticket.Ticket;
import parkinglot.dao.entity.vehicle.Vehicle;
import parkinglot.repository.ParkingLotRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpotManager {
    private final ParkingLotRepository parkingLotRepository = new ParkingLotRepository();


    public abstract ParkingSpot findParkingSpot();

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingLotRepository.addParkingLot(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) throws Exception{
        parkingLotRepository.removeParkingSpot(parkingSpot);
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) throws Exception {
        List<ParkingSpot> parkingSpotList = parkingLotRepository.getParkingLots();

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
        List<ParkingSpot> parkingSpotList = parkingLotRepository.getParkingLots();

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
