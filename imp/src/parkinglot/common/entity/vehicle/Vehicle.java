package parkinglot.common.entity.vehicle;

import parkinglot.common.constants.VehicleType;

public class Vehicle {
    private int id;
    private VehicleType vehicleType;

    public Vehicle(int id, VehicleType vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
