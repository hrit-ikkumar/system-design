package parkinglot.common.entity.parkingspot;

import parkinglot.common.entity.vehicle.Vehicle;

public abstract class ParkingSpot {
    private int id;
    private boolean isEmpty = true;

    private Vehicle vehicle;

    public void parkVehicle(Vehicle vehicle) {
     this.vehicle = vehicle;
     this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Vehicle vehicle() {
        return vehicle;
    }
}
