package parkinglot.common.entity.entrance;

import parkinglot.common.constants.VehicleType;
import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.parkingspot.manager.ParkingSpotManager;
import parkinglot.common.entity.parkingspot.manager.factory.ParkingManagerFactory;
import parkinglot.common.entity.ticket.Ticket;
import parkinglot.common.entity.vehicle.Vehicle;

import java.sql.Date;
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
