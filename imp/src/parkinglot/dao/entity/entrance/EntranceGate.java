package parkinglot.dao.entity.entrance;

import parkinglot.dao.constants.VehicleType;
import parkinglot.dao.entity.parkingspot.ParkingSpot;
import parkinglot.services.ParkingSpotManager;
import parkinglot.services.factory.ParkingManagerFactory;
import parkinglot.dao.entity.ticket.Ticket;
import parkinglot.dao.entity.vehicle.Vehicle;

import java.sql.Timestamp;

public class EntranceGate {
    private final ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();
    private ParkingSpotManager parkingSpotManager;

    public EntranceGate(VehicleType vehicleType) {
        this.parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicleType);
    }

    public ParkingSpot findSpace() {
        return parkingSpotManager.findParkingSpot();
    }
    public void bookSpot(Vehicle vehicle, ParkingSpot spot) {
        spot.parkVehicle(vehicle);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot spot) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Timestamp(System.currentTimeMillis()));
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(spot);
        return ticket;
    }
}
