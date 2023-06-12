package parkinglot;

import parkinglot.common.constants.VehicleType;
import parkinglot.common.entity.entrance.EntranceGate;
import parkinglot.common.entity.exit.ExitGate;
import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.parkingspot.TwoWheelerSpot;
import parkinglot.common.entity.parkingspot.manager.ParkingSpotManager;
import parkinglot.common.entity.parkingspot.manager.factory.ParkingManagerFactory;
import parkinglot.common.entity.ticket.Ticket;
import parkinglot.common.entity.vehicle.Vehicle;

public class Driver {
    public static void main(String args[]) throws Exception {
        // Vehicle Came
        Vehicle vehicle = new Vehicle(1, VehicleType.TWO_WHEELER);
        // create enterance gate
        EntranceGate entranceGate = new EntranceGate(vehicle.getVehicleType());

        // Parking Spot Manager
        ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicle.getVehicleType());
        // Parking Spot
        ParkingSpot parkingSpot = new TwoWheelerSpot();
        // added one parking spot
        parkingSpotManager.addParkingSpot(parkingSpot);

        entranceGate.bookSpot(vehicle, parkingSpot);
        Ticket ticket = entranceGate.generateTicket(vehicle, parkingSpot);
        System.out.println(ticket.toString());
        System.out.println(parkingSpot);
        // unpark the
        ExitGate exitGate = new ExitGate();
        double price = exitGate.price(ticket);
        System.out.println(price);
        exitGate.removeVehicle(ticket);
        System.out.println(parkingSpot);
    }
}
