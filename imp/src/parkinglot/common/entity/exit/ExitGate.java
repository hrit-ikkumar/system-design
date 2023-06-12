package parkinglot.common.entity.exit;

import parkinglot.common.constants.CostComputerType;
import parkinglot.common.constants.VehicleType;
import parkinglot.common.entity.cost.CostComputeFactory;
import parkinglot.common.entity.cost.computer.CostComputer;
import parkinglot.common.entity.ticket.Ticket;
import parkinglot.common.entity.vehicle.Vehicle;

public class ExitGate {
    private int id;
    private Ticket ticket;

    private CostComputeFactory costComputeFactory = new CostComputeFactory();
    private CostComputer computer = costComputeFactory.getCostComputer(CostComputerType.TWO_WHEELER_COST_COMPUTER);

    public double price(Ticket ticket) {
        return computer.price(ticket);
    }

    public void removeVehicle(Ticket ticket) {
        ticket.getParkingSpot().removeVehicle();
    }
}
