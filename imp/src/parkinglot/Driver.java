package parkinglot;

import parkinglot.dao.constants.Command;
import parkinglot.dao.constants.VehicleType;
import parkinglot.dao.entity.entrance.EntranceGate;
import parkinglot.dao.entity.exit.ExitGate;
import parkinglot.dao.entity.parkingspot.ParkingSpot;
import parkinglot.dao.entity.parkingspot.TwoWheelerSpot;
import parkinglot.services.ParkingSpotManager;
import parkinglot.services.TwoWheelerPSManager;
import parkinglot.services.factory.ParkingManagerFactory;
import parkinglot.dao.entity.ticket.Ticket;
import parkinglot.dao.entity.vehicle.Vehicle;

import java.util.Scanner;

public class Driver {
    public static void main(String args[]) throws Exception {

        ParkingSpotManager parkingSpotManager = new TwoWheelerPSManager();

        while(true) {
            Scanner scan = new Scanner(System.in);
            Command type = Command.of(scan.next());
            switch(type) {
                case CREATE_PARKING_LOT:
                    parkingSpotManager = new TwoWheelerPSManager();
                    break;
                case PARK_VEHICLE:
                    parkingSpotManager.parkVehicle(new Vehicle(scan.nextInt(), VehicleType.TWO_WHEELER), parkingSpotManager.findParkingSpot());
                    break;
                case DISPLAY:
                    System.out.println(parkingSpotManager.toString());
                    break;
                case EXIT:
                    return;
            }
        }
    }
}
