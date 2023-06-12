package parkinglot.common.entity.ticket;

import parkinglot.common.entity.parkingspot.ParkingSpot;
import parkinglot.common.entity.vehicle.Vehicle;

import java.sql.Timestamp;

public class Ticket {
    private Timestamp entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                '}';
    }
}
