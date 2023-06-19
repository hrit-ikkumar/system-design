package parkinglot.dao.entity.exit;

import parkinglot.dao.constants.CostComputerType;
import parkinglot.dao.entity.cost.CostComputeFactory;
import parkinglot.dao.entity.cost.computer.CostComputer;
import parkinglot.dao.entity.ticket.Ticket;

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
