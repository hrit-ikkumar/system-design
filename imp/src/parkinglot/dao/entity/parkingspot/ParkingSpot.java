package parkinglot.dao.entity.parkingspot;

import parkinglot.dao.entity.vehicle.Vehicle;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", isEmpty=" + isEmpty +
                ", vehicle=" + vehicle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSpot that = (ParkingSpot) o;
        return id == that.id && isEmpty == that.isEmpty && Objects.equals(vehicle, that.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isEmpty, vehicle);
    }
}
